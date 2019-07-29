package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038605.
 * @author Sean A. Irvine
 */
public class A038605 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
