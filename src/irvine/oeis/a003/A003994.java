package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003994 Sequence <code>b_4 (n)</code> arising from homology of partitions with even number of blocks.
 * @author Sean A. Irvine
 */
public class A003994 implements Sequence {

  private int mN = 3;
  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;
  private Z mT = Z.ONE;

  // General recurrence from "Plethsym" paper
//  private Z b(final int i, final int n) {
//    if (i == 2) {
//      return Z.ONE;
//    }
//    if (i == 3) {
//      return Z.THREE.pow(n - 2).multiply2().subtract(2L * (n - 1));
//    }
//    if (n < i) {
//      return Z.ZERO;
//    }
//    assert i >= 4;
//    Z s = Z.ZERO;
//    for (int k = 0; k <= i - 2; ++k) {
//      Z t = Z.ZERO;
//      for (int r = 1; 2 * r <= i; ++r) {
//        t = t.signedAdd((r & 1) == 1, Binomial.binomial(i - k, i - 2 * r).multiply(b(i - k, n - r)));
//      }
//      s = s.add(t.multiply(Binomial.binomial(2L * n - 2L * i + k, k)));
//    }
//    return s;
//  }

  @Override
  public Z next() {
    //return b(4, ++mN);
    if (++mN > 4) {
      mT = mT.multiply(3);
    }
    final Z n = Z.valueOf(mN);
    final Z t = mB.multiply(6).subtract(mA)
      .add(n.multiply(-8).add(40).multiply(mN).subtract(42))
      .add(n.shiftLeft(5).subtract(112).multiply(mT));
    mA = mB;
    mB = t;
    return t;
  }
}
