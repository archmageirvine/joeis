package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031196 Numbers having period-3 6-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031196 extends A031195 {

  /** Construct the sequence. */
  public A031196() {
    super(1);
  }

  @Override
  public Z next() {
    while (!Z.THREE.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
