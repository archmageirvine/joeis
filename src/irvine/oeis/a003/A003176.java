package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003176 Integer part of <code>24(2^n-1)/n</code>.
 * @author Sean A. Irvine
 */
public class A003176 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(1).multiply(24).divide(mN);
  }
}
