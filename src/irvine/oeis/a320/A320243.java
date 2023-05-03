package irvine.oeis.a320;
// manually n2 at 2023-05-02 19:56

import irvine.math.z.Z;

/**
 * A320243 Number of integer solutions (a_1, a_2, ... , a_8) to the equation a_1^2 + 2*a_2^2 + ... + 8*a_8^2 = 3*n.
 * @author Georg Fischer
 */
public class A320243 extends A320234 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}
