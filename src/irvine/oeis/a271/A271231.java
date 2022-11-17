package irvine.oeis.a271;

import irvine.math.z.Z;
import irvine.oeis.a159.A159819;

/**
 * A271231 Expansion of the modular cusp form ( (eta(q^4) * eta(q^12) )^4 / ( eta(q^2) * eta(q^6) * eta(q^8) * eta(q^24) ), where eta is Dedekind&apos;s eta function.
 * @author Georg Fischer
 */
public class A271231 extends A159819 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 0) ? Z.ZERO : super.next();
  }
}
