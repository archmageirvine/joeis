package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031190 Numbers having period-6 5-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031190 extends A031186 {

  /** Construct the sequence. */
  public A031190() {
    super(1);
  }

  @Override
  public Z next() {
    while (!Z.SIX.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
