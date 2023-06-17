package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A014493 Odd triangular numbers.
 * @author Sean A. Irvine
 */
public class A014493 extends AbstractSequence {

  /** Construct the sequence. */
  public A014493() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN - 1).multiply(2 * (mN - 1 + (mN & 1))).divide2();
  }
}
