package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000610 Number of self-complementary Boolean functions of n variables: see Comments for precise definition.
 * @author Sean A. Irvine
 */
public class A000610 extends A000721 {

  private int mN = -1;

  /** Construct the sequence. */
  public A000610() {
    super(0);
  }

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ZERO : f(mN).apply(0, 1).toZ();
  }
}
