package irvine.oeis.a099;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A099360 a(n) = (2^n + 1)^4 - 2.
 * @author Georg Fischer
 */
public class A099360 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).add(1).pow(4).subtract(2);
  }
}
