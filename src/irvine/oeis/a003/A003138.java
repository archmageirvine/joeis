package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003138 Nearest integer to <code>24(2^n-1)/n</code>.
 * @author Sean A. Irvine
 */
public class A003138 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).subtract(1).multiply(24).add(mN / 2).divide(mN);
  }
}

