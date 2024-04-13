package irvine.oeis.a022;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A022487 Sum of digits in n-th term of A022482.
 * @author Sean A. Irvine
 */
public class A022487 extends A022482 {

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next());
  }
}
