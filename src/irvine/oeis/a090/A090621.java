package irvine.oeis.a090;
// manually A054861/parm2 at 2022-01-08 16:17

import irvine.math.z.Z;
import irvine.oeis.a011.A011371;

/**
 * A090621 Highest power of 16 dividing n!.
 * @author Georg Fischer
 */
public class A090621 extends A011371 {

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}
