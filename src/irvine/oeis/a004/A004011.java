package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000118;

/**
 * A004011 Theta series of D_4 lattice; Fourier coefficients of Eisenstein series E_{gamma,2}.
 * @author Sean A. Irvine
 */
public class A004011 extends A000118 {

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}
