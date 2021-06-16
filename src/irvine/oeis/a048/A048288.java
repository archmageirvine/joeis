package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000422;

/**
 * A048288 Number of prime factors counted with multiplicity of the reverse concatenation of numbers from 1 to n.
 * @author Sean A. Irvine
 */
public class A048288 extends A000422 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega());
  }
}
