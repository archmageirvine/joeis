package irvine.oeis.a054;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;

/**
 * A054081 Array T by antidiagonals: for n &gt;= 0 and k &gt;= 1, let p(k)=least positive integer not already in a(i), q(k)=p(k)+k+n-1, a(p(k))=q(k), a(q(k))=p(k); then for h&gt;=1, T(n,h)=a(h).
 * @author Sean A. Irvine
 */
public class A054081 extends Sequence1 {

  private final DynamicIntArray mStep = new DynamicIntArray();
  private final List<DynamicIntArray> mPerm = new ArrayList<>();

  private int mN = -1;
  private int mM = 0;

  private long t(final int n, final int k) {
    while (n >= mPerm.size()) {
      final DynamicIntArray e = new DynamicIntArray();
      e.set(0, n + 1);
      e.set(n, 1);
      mPerm.add(e);
      mStep.set(n, n + 1);
    }
    final DynamicIntArray row = mPerm.get(n);
    if (row.get(k) == 0) {
      row.set(k, k + 1 + mStep.get(n));
      row.set(k + mStep.get(n), k + 1);
      mStep.set(n, mStep.get(n) + 1);
    }
    return row.get(k);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(t(mM, mN - mM));
  }
}
