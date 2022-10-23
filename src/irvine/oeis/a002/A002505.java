package irvine.oeis.a002;

import irvine.math.r.Constants;
import irvine.math.r.LambertW;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002505 Nearest integer to the n-th Gram point.
 * @author Sean A. Irvine
 */
public class A002505 extends Sequence0 {

  private static final double INV8E = 1.0 / (8 * Math.E);
  private long mN = -1;
  
  @Override
  public Z next() {
    if (++mN > 3000) {
      // I have verified this implementation against T.D. Noe's a-file to 3000.
      // It may well work beyond this limit.
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(Math.round(Constants.TAU * Math.exp(1 + LambertW.w((8 * mN + 1) * INV8E))));
  }
}
