package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003469.
 * @author Sean A. Irvine
 */
public class A003469 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.shiftLeft(mN - 1).subtract(n.multiply(mN + 1).divide2());
  }
}

