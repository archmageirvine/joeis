package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a225.A225171;

/**
 * A005756 Number of <code>non-degenerate fanout-free</code> Boolean functions of n variables having AND rank 2.
 * @author Sean A. Irvine
 */
public class A005756 extends A225171 {

  private int mN = 1;

  @Override
  public Z next() {
    return and(++mN, 2);
  }
}
