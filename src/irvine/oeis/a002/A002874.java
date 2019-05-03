package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a162.A162663;

/**
 * A002874 The number of partitions of <code>{1..3n}</code> that are invariant under a permutation consisting of <code>n 3-cycles</code>.
 * @author Sean A. Irvine
 */
public class A002874 extends A162663 {

  private int mN = -1;

  @Override
  public Z next() {
    return u(++mN, 3);
  }
}
