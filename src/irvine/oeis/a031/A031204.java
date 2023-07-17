package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031204 Numbers having period-12 7-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031204 extends A031200 {

  /** Construct the sequence. */
  public A031204() {
    super(1);
  }

  private static final Z Z12 = Z.valueOf(12);

  @Override
  public Z next() {
    while (!Z12.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
