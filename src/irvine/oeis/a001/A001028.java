package irvine.oeis.a001;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A001028 E.g.f. satisfies <code>A'(x) = 1 + A(A(x)), A(0)=0</code>.
 * @author Sean A. Irvine
 */
public class A001028 implements Sequence {

  private final ArrayList<Q> mSeq = new ArrayList<>();
  private final HashMap<String, Q> mCo = new HashMap<>();
  private int mN = 0;
  private Z mF = Z.ONE;


  private Q coCompute(final int n, final int k) {
    Q s = Q.ZERO;
    for (int j = 1; j <= n - k + 1; ++j) {
      s = s.add(mSeq.get(j).multiply(co(n - j, k - 1)));
    }
    return s;
  }

  private Q co(final int n, final int k) {
    if (k == 1) {
      return mSeq.get(n);
    }
    final String key = n + "_" + k;
    final Q r = mCo.get(key);
    if (r != null) {
      return r;
    }
    final Q s = coCompute(n, k);
    mCo.put(key, s);
    return s;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      mSeq.add(Q.ZERO);
      mSeq.add(Q.ONE);
    } else {
      Q s = Q.ZERO;
      for (int k = 1; k < mN; ++k) {
        s = s.add(co(mN - 1, k).multiply(mSeq.get(k)));
      }
      mSeq.add(s.divide(mN));
    }
    mF = mF.multiply(mN);
    final Q q = mSeq.get(mN).multiply(mF);
    return q.toZ();
  }
}
