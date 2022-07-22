package irvine.oeis.a090;
// manually A054861/parm2 at 2022-01-08 16:17

import irvine.math.z.Z;
import irvine.oeis.a011.A011371;

/**
 * A090617 Exponent of highest power of 8 dividing n!.
 * @author Georg Fischer
 */
public class A090617 extends A011371 {

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}
