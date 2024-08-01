package irvine.oeis.a373;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a098.A098097;

/**
 * A373876 Number of n X n matrices over GF(3) whose permanent is 0.
 * @author Sean A. Irvine
 */
public class A373876 extends A098097 {

  @Override
  public Z next() {
    return Functions.DIGIT_LENGTH.z(super.next());
  }
}
