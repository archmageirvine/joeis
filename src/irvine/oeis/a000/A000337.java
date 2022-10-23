package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000337 a(n) = (n-1)*2^n + 1.
 * @author Sean A. Irvine
 */
public class A000337 extends Sequence0 {

  private int mN = -2;

  @Override
  public Z next() {
    return Z.valueOf(++mN).shiftLeft(mN + 1).add(1);
  }
}

