package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028359 Two-bell analog of A028355.
 * @author Sean A. Irvine
 */
public class A028359 extends Sequence1 {

  private long mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    ++mN;
    Z strike = Z.ZERO;
    long s = 0;
    while (s != mN) {
      if (++mM == 3) {
        mM = 1;
      }
      s += mM;
      strike = strike.multiply(10).add(mM);
    }
    return strike;
  }
}

