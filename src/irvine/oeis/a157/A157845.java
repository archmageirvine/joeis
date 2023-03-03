package irvine.oeis.a157;
// manually knest at 2023-03-02 11:48

import irvine.math.z.Z;
import irvine.oeis.a010.A010062;

/**
 * A157845 a(0) = 1, a(n) = sum of binary digits of all prior terms, expressed in binary.
 * @author Georg Fischer
 */
public class A157845 extends A010062 {

  private int mN = -1;

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : new Z(super.next().toString(2));
  }
}
