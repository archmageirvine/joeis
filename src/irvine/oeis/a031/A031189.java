package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031189 Numbers having period-4 5-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031189 extends A031186 {

  /** Construct the sequence. */
  public A031189() {
    super(1);
  }

  @Override
  public Z next() {
    while (!Z.FOUR.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
