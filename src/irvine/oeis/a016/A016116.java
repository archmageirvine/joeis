package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016116 a(n) = 2^floor(n/2).
 * @author Sean A. Irvine
 */
public class A016116 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN / 2);
  }
}
