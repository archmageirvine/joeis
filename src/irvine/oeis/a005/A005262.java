package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005262.
 * @author Sean A. Irvine
 */
public class A005262 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.SEVEN.shiftLeft(mN + 1).subtract(9L * mN + 10).divide(3);
  }
}

