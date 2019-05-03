package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000733 Boustrophedon transform of partition numbers <code>1, 1, 1, 2, 3, 5, 7</code>, ...
 * @author Sean A. Irvine
 */
public class A000733 extends A000674 {

  private final A000041 mPartitions = new A000041();

  // Boustrophedon transform
  @Override
  protected Z a(final int n) {
    return n == 0 ? Z.ONE : mPartitions.next();
  }
}
