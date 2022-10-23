package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A000247 a(n) = 2^n - n - 2.
 * @author Sean A. Irvine
 */
public class A000247 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).subtract(mN + 2);
  }
}

