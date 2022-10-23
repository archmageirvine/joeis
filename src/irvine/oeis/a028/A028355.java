package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028355 How the astronomical clock ("Orloj") in Prague would strike 1,2,3,...,24,25,.. (digits follow 12343212343... (A028356), n-th group adds to n).
 * @author Sean A. Irvine
 */
public class A028355 extends Sequence1 {

  private static final long[] ORLOJ = {1, 2, 3, 4, 3, 2};

  private long mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    ++mN;
    Z strike = Z.ZERO;
    long s = 0;
    while (s != mN) {
      if (++mM == ORLOJ.length) {
        mM = 0;
      }
      s += ORLOJ[mM];
      strike = strike.multiply(10).add(ORLOJ[mM]);
    }
    return strike;
  }
}

