package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000023 Expansion of e.g.f. <code>exp(-2*x)/(1-x)</code>.
 * @author Sean A. Irvine
 */
public class A000023 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z p = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      final Z v = p.shiftLeft(mN - k);
      sum = sum.signedAdd(((mN - k) & 1) == 0, v);
      p = p.multiply(mN - k);
    }
    return sum;
  }
}

