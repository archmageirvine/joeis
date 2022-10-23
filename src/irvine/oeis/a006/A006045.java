package irvine.oeis.a006;

import irvine.math.api.Matrix;
import irvine.math.group.IntegersMod;
import irvine.math.group.MatrixRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006045 Sum of orders of all 2 X 2 matrices with entries mod n.
 * @author Sean A. Irvine
 */
public class A006045 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final MatrixRing<Z> ring = new MatrixRing<>(2, new IntegersMod(++mN));
    Z sum = Z.ZERO;
    for (final Matrix<Z> m : ring) {
      sum = sum.add(ring.ord(m));
    }
    return sum;
  }
}

