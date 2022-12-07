package irvine.oeis.a160;

import irvine.math.z.Z;
import irvine.oeis.a002.A002655;

/**
 * A160806 Expansion of q^(-1/3) * (eta(q) * eta(q^7) + eta(q^4) * eta(q^28)) in powers of q^2.
 * @author Georg Fischer
 */
public class A160806 extends A002655 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
