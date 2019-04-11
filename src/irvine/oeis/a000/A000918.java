package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000918 <code>a(n) = 2^n - 2</code>.
 * @author Sean A. Irvine
 */
public class A000918 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(2);
  }
}

