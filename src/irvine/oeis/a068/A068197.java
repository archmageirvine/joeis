package irvine.oeis.a068;

import java.util.HashSet;

import irvine.math.api.Matrix;
import irvine.math.group.IntegersMod;
import irvine.math.group.MatrixRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068197 Number of squares (of another matrix) in M_2(n) - the ring of 2 X 2 matrices over Z_n.
 * @author Sean A. Irvine
 */
public class A068197 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final MatrixRing<Z> ring = new MatrixRing<>(2, new IntegersMod(++mN));
    final HashSet<Matrix<Z>> squares = new HashSet<>();
    for (final Matrix<Z> mat : ring) {
      squares.add(ring.multiply(mat, mat));
    }
    return Z.valueOf(squares.size());
  }
}
