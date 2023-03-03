package irvine.oeis.a345;
// manually knestm/knest at 2023-03-02 19:24

import irvine.math.z.Z;
import irvine.oeis.a054.A054116;

/**
 * A345889 Number of tilings of an n-cell circular array with rectangular tiles of any size, and where the number of possible colors of a tile is given by the smallest cell covered.
 * @author Georg Fischer
 */
public class A345889 extends A054116 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
