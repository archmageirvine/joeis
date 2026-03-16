package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393794 Fixed points of the 1089-trick map T(n) = |n - reverse(n)| + reverse(|n - reverse(n)|).
 * @author Sean A. Irvine
 */
public class A393794 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    return Z.TEN.pow(++mN).subtract(1).multiply(110);
  }
}
