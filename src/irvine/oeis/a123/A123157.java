package irvine.oeis.a123;
// manually 2024-03-14

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;

/**
 * A123157 Sum of digits of the squares of prime numbers.
 * @author Georg Fischer
 */
public class A123157 extends A000040 implements DirectSequence {

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    return Z.valueOf(ZUtils.digitSum(super.a(n).square()));
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next().square()));
  }
}
