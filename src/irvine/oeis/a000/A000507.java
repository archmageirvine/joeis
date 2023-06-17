package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000507 Number of permutations of [n] with exactly 3 increasing runs of length at least 2.
 * @author Sean A. Irvine
 */
public class A000507 extends AbstractSequence {

  /* Construct the sequence. */
  public A000507() {
    super(6);
  }

  private int mN = 5;

  @Override
  public Z next() {
    ++mN;
    final Z n = Z.valueOf(mN);
    final Z ns = n.square();
    return Z.SEVEN.pow(mN).multiply(3)
      .subtract(Z.FIVE.pow(mN).multiply(6L * mN - 9))
      .add(Z.THREE.pow(mN).multiply(ns.multiply(6).subtract(18L * mN).add(3)))
      .subtract(ns.multiply(4L * mN))
      .add(ns.multiply(18))
      .subtract(n.multiply(8))
      .subtract(15)
      .divide(192);
  }
}
