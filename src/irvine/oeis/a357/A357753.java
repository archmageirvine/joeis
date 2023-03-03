package irvine.oeis.a357;
// manually knestm/knest at 2023-03-02 20:40

import irvine.math.z.Z;
import irvine.oeis.a017.A017912;

/**
 * A357753 a(n) is the least square with n binary digits.
 * @author Georg Fischer
 */
public class A357753 extends A017912 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
