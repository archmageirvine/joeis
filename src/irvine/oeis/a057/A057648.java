package irvine.oeis.a057;

import irvine.math.lattice.Lattices;
import irvine.math.z.Z;

/**
 * A057648 Number of excursions of length n on the upper-right part of the hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A057648 extends A057647 {

  @Override
  public Z next() {
    super.next();
    final Z cnt = mCounts.get(Lattices.HEXAGONAL.origin());
    return cnt == null ? Z.ZERO : cnt;
  }
}
