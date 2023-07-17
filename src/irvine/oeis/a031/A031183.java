package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031183 Numbers having period-1 4-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031183 extends A031182 {

  /** Construct the sequence. */
  public A031183() {
    super(1);
  }

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
