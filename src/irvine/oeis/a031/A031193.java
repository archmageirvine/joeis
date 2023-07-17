package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031193 Numbers having period-22 5-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031193 extends A031186 {

  /** Construct the sequence. */
  public A031193() {
    super(1);
  }

  private static final Z Z22 = Z.valueOf(22);

  @Override
  public Z next() {
    while (!Z22.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
