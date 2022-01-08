package irvine.oeis.a090;
// manually A054861/parm2 at 2022-01-08 16:17

import irvine.math.z.Z;
import irvine.oeis.a011.A011371;

/**
 * A090616 Highest power of 4 dividing n!.
 * @author Georg Fischer
 */
public class A090616 extends A011371 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
