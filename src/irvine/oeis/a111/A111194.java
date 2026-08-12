package irvine.oeis.a111;
// manually 2026-08-11/perman01 at 2026-08-11 14:47

import irvine.math.group.MatrixField;
import irvine.math.matrix.LambdaMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

import java.util.function.BiFunction;


/**
 * A111194 Permanent of the inverse Hilbert matrix.
 * @author Georg Fischer
 */
public class A111194 extends AbstractSequence {

  private long mN = 0;
  private BiFunction<Long, Long, Q> mLambda;

  /** Construct the sequence */
  public A111194() {
    super(0);
    mN = -1;
    mLambda = (i, j) -> new Q(1, i + j - 1);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final MatrixField<Q> mF = new MatrixField<>(mN, Rationals.SINGLETON);
    final LambdaMatrix<Q> mat = new LambdaMatrix<Q>(mN, mN, Q.ZERO, mLambda, 1);
    return mF.permanent(mF.inverse(mat)).num();
  }
}
