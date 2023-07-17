package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031191 Numbers having period-10 5-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031191 extends A031186 {

  /** Construct the sequence. */
  public A031191() {
    super(1);
  }

  @Override
  public Z next() {
    while (!Z.TEN.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
