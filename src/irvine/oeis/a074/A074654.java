package irvine.oeis.a074;

import irvine.math.z.Z;

/**
 * A074654 Number of Lyndon words (aperiodic necklaces) with <code>5n</code> beads of 5 colors, n beads of each color. One color labeled, the other 4 unlabeled.
 * @author Sean A. Irvine
 */
public class A074654 extends A074653 {

  @Override
  public Z next() {
    return super.next().divide(120);
  }
}
