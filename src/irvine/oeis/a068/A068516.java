package irvine.oeis.a068;

import java.util.HashSet;

import irvine.math.api.Field;
import irvine.math.api.Group;
import irvine.math.api.Matrix;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.group.IntegersMod;
import irvine.math.group.MultiplicativeGroup;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A068516 Number of squares (of another matrix) in the group GL(2,Z_n) described in sequence A000252.
 * @author Sean A. Irvine
 */
public class A068516 extends MultiplicativeSequence {

  private static final class MyField extends IntegersMod implements Field<Z> {

    private MyField(final Z mod) {
      super(mod);
    }

    @Override
    public Z inverse(final Z element) {
      return element.modInverse(size());
    }

    @Override
    public Z divide(final Z n, final Z d) {
      return n.modMultiply(inverse(d), size());
    }

    @Override
    public Group<Z> multiplicativeGroup() {
      return new MultiplicativeGroup<>(this);
    }
  }

  /** Construct the sequence. */
  public A068516() {
    super(2, (p, e) -> {
      final GeneralLinearGroup<Z> gl = new GeneralLinearGroup<>(2, new MyField(p.pow(e)));
      final HashSet<Matrix<Z>> squares = new HashSet<>();
      for (final Matrix<Z> mat : gl) {
        squares.add(gl.add(mat, mat));
      }
      return Z.valueOf(squares.size());
    });
  }
}
