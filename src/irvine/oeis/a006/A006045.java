package irvine.oeis.a006;

import irvine.math.api.Matrix;
import irvine.math.group.IntegersMod;
import irvine.math.group.MatrixRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006045 Sum of orders of all <code>2 X 2</code> matrices with entries <code>mod n</code>.
 * @author Sean A. Irvine
 */
public class A006045 implements Sequence {

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

