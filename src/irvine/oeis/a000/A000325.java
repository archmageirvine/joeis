package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000325 a(n) = 2^n - n.
 * @author Sean A. Irvine
 */
public class A000325 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(mN);
  }
}

