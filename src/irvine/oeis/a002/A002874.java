package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a162.A162663;

/**
 * A002874 The number of partitions of {1..3n} that are invariant under a permutation consisting of n 3-cycles.
 * @author Sean A. Irvine
 */
public class A002874 extends A162663 {

  private int mN = -1;

  @Override
  public Z next() {
    return u(++mN, 3);
  }
}
