package irvine.oeis.a174;

import java.util.function.BiFunction;

import irvine.math.group.MatrixField;
import irvine.math.matrix.LambdaMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A174647 Determinant of the matrix a(i,j) = 1 if abs(i-j) &lt; 2 and -1 in the rest.
 * @author Sean A. Irvine
 */
public class A174647 extends Sequence0 {

  private long mN = -1;
  private final BiFunction<Long, Long, Q> mLambda = (i, j) -> Math.abs(i - j) < 2 ? Q.ONE : Q.NEG_ONE;

  @Override
  public Z next() {
    return new MatrixField<>(++mN, Rationals.SINGLETON).det(new LambdaMatrix<>(mN, mN, Q.ZERO, mLambda, 1)).toZ();
  }
}
