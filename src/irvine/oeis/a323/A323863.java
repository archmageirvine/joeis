package irvine.oeis.a323;

import irvine.math.z.Z;

/**
 * A323863 Number of n X n aperiodic binary arrays.
 * @author Gregory Morse
 */
public class A323863 extends A323861 {
  private int mN = -1;

  /** Construct the sequence. */
  public A323863() {
    setOffset(0);
  }

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : aperiodic(mN, mN).multiply((long) mN * mN);
  }
}
