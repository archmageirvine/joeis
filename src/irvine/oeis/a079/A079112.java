package irvine.oeis.a079;
// manually knest at 2023-03-02 11:48

import irvine.math.z.Z;
import irvine.oeis.a053.A053738;

/**
 * A079112 Numbers in binary representation with odd length.
 * @author Georg Fischer
 */
public class A079112 extends A053738 {

  private int mN = -1;

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : new Z(super.next().toString(2));
  }
}
