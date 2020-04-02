package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a003.A003781;

/**
 * A030443 Nonzero coefficients in theta series of <code>{E_7}*</code> lattice.
 * @author Sean A. Irvine
 */
public class A030443 extends A003781 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.ZERO.equals(t));
    return t;
  }
}

