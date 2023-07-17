package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031199 Numbers having period-30 6-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031199 extends A031195 {

  /** Construct the sequence. */
  public A031199() {
    super(1);
  }

  private static final Z Z30 = Z.valueOf(30);

  @Override
  public Z next() {
    while (!Z30.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
