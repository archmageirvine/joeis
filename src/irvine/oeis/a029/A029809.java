package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a074.A074652;

/**
 * A029809 Number of Lyndon words (aperiodic necklaces) with <code>4n</code> beads of 4 colors, n beads of each color. One color labeled, the other 3 unlabeled.
 * @author Sean A. Irvine
 */
public class A029809 extends A074652 {

  @Override
  public Z next() {
    return super.next().divide(24);
  }
}
