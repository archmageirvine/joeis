package irvine.oeis.a101;
// manually 2026-08-11/perman01 at 2026-08-11 14:47

import java.util.function.BiFunction;

import irvine.math.group.MatrixField;
import irvine.math.matrix.LambdaMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;


/**
 * A101812 Denominator of the permanent of the n-th Hilbert matrix.
 * @author Georg Fischer
 */
public class A101812 extends AbstractSequence {

  private long mN = 0;
  private BiFunction<Long, Long, Q> mLambda;

  /** Construct the sequence */
  public A101812() {
    super(1);
    mN = 0;
    mLambda = (i, j) -> new Q(1, i + j - 1);
  }

  @Override
  public Z next() {
    ++mN;
    final LambdaMatrix<Q> mat = new LambdaMatrix<Q>(mN, mN, Q.ZERO, mLambda, 1);
    return new MatrixField<Q>(mN, Rationals.SINGLETON).permanent(mat).den();
  }
}
