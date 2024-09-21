package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a060.A060594;

/**
 * A072273 Index of powers of 2 that equal the number of noncongruent roots to the congruence x^2 == k (mod n) for (k,n)=1 and assuming solvability.
 * @author Sean A. Irvine
 */
public class A072273 extends A060594 {

  @Override
  public Z next() {
    return Functions.DIGIT_LENGTH.z(2, super.next()).subtract(1);
  }
}
