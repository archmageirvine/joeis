package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003177.
 * @author Sean A. Irvine
 */
public class A003177 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(1).multiply(24).add(mN - 1).divide(mN);
  }
}
