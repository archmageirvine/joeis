package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A054574 Begin with n-th prime, add its prime divisors (itself), repeat until reach a new prime; sequence gives prime reached.
 * @author Sean A. Irvine
 */
public class A054574 extends A000040 {

  @Override
  public Z next() {
    Z n = super.next().multiply2(); // obviously never prime
    do {
      n = n.add(Functions.SOPFR.z(n));
    } while (!n.isProbablePrime());
    return n;
  }
}
