package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031197 Numbers having period-4 6-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031197 extends A031195 {

  /** Construct the sequence. */
  public A031197() {
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
