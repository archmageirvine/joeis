package irvine.oeis.a236;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A236959 Number of nonzero cubic residues modulo the n-th prime.
 * @author Sean A. Irvine
 */
public class A236959 extends A000040 {

  @Override
  public Z next() {
    final Z p1 = super.next().subtract(1);
    return p1.divide(p1.gcd(3));
  }
}
