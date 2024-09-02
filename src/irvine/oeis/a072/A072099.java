package irvine.oeis.a072;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072099 First term = 1 and, for each n &gt; 1, n*a(n) does not appear.
 * @author Sean A. Irvine
 */
public class A072099 extends Sequence1 {

  private final HashSet<Long> mForbidden = new HashSet<>();
  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    while (mForbidden.contains(++mM)) {
      // do nothing
    }
    mForbidden.add(mM * mN);
    return Z.valueOf(mM);
  }
}
