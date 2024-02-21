package irvine.oeis.a068;

import java.util.HashSet;

import irvine.math.api.Matrix;
import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A068516 Number of squares (of another matrix) in the group GL(2,Z_n) described in sequence A000252.
 * @author Sean A. Irvine
 */
public class A068516 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A068516() {
    super(2, (p, e) -> {
      final GeneralLinearGroup<Z> gl = new GeneralLinearGroup<>(2, new GaloisField(p, e));
      final HashSet<Matrix<Z>> squares = new HashSet<>();
      for (final Matrix<Z> mat : gl) {
        squares.add(gl.add(mat, mat));
      }
      return Z.valueOf(squares.size());
    });
  }
}
