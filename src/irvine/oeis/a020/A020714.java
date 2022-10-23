package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020714 a(n) = 5 * 2^n.
 * @author Sean A. Irvine
 */
public class A020714 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.FIVE.shiftLeft(++mN);
  }
}
