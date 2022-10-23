package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003461 Bode numbers multiplied by 10: 4 + 3*floor(2^(n-1)).
 * @author Sean A. Irvine
 */
public class A003461 extends Sequence0 {

  private int mN = -2;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).multiply(3).add(4);
  }
}
