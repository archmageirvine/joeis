package irvine.oeis.a373;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a098.A098097;

/**
 * A071291.
 * @author Sean A. Irvine
 */
public class A373876 extends A098097 {

  @Override
  public Z next() {
    return Functions.DIGIT_LENGTH.z(super.next());
  }
}
