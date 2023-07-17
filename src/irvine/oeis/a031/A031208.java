package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031208 Numbers having period-30 7-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031208 extends A031200 {

  /** Construct the sequence. */
  public A031208() {
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
