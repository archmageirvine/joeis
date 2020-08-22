package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020714 a(n) = 5 * 2^n.
 * @author Sean A. Irvine
 */
public class A020714 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.FIVE.shiftLeft(++mN);
  }
}
