package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031205 Numbers having period-14 7-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031205 extends A031200 {

  /** Construct the sequence. */
  public A031205() {
    super(1);
  }

  private static final Z Z14 = Z.valueOf(14);

  @Override
  public Z next() {
    while (!Z14.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
