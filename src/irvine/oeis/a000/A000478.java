package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000478 Number of ways of placing n labeled balls into 3 indistinguishable boxes with at least 2 balls in each box.
 * @author Sean A. Irvine
 */
public class A000478 extends AbstractSequence {

  /** Construct the sequence. */
  public A000478() {
    super(6);
  }

  private int mN = 5;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.add(mN).add(mN * (long) mN)
      .subtract(Z.TWO.add(mN).shiftLeft(mN - 1))
      .add(Z.THREE.pow(mN - 1))
      .divide2();
  }
}
