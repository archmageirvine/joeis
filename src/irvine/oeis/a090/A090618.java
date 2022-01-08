package irvine.oeis.a090;
// manually A054861/parm2 at 2022-01-08 16:17

import irvine.math.z.Z;
import irvine.oeis.a054.A054861;

/**
 * A090618 Highest power of 9 dividing n!.
 * @author Georg Fischer
 */
public class A090618 extends A054861 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
