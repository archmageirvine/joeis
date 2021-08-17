package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000422;

/**
 * A050677 Number of prime factors of concatenation of numbers from n down to 1, with multiplicity.
 * @author Sean A. Irvine
 */
public class A050677 extends A000422 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega()).max(Z.ONE);
  }
}
