package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a060.A060821;

/**
 * A067613 Triangular table of coefficients of the Hermite polynomials, divided by 2^floor(n/2).
 * @author Sean A. Irvine
 */
public class A067613 extends A060821 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return super.next().multiply(Z.NEG_ONE.pow(mN)).shiftRight(mN / 2);
  }
}

