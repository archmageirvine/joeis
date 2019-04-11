package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003177 <code>a(n) =</code> ceiling(24(2^n-1)/n).
 * @author Sean A. Irvine
 */
public class A003177 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(1).multiply(24).add(mN - 1).divide(mN);
  }
}
