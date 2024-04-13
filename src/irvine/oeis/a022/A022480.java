package irvine.oeis.a022;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006711;

/**
 * A022480 Sum of digits in n-th term of A006711.
 * @author Sean A. Irvine
 */
public class A022480 extends A006711 {

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next());
  }
}
