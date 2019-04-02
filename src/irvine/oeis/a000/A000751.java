package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000751 Boustrophedon transform of partition numbers.
 * @author Sean A. Irvine
 */
public class A000751 extends A000674 {

  private final A000041 mPartitions = new A000041();

  // Boustrophedon transform
  @Override
  protected Z a(final int n) {
    return mPartitions.next();
  }
}
