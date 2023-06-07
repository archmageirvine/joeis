package irvine.oeis.a102;
// manually trisum/trisum2 at 2023-06-07 08:41

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a008.A008459;
import irvine.oeis.a023.A023531;
import irvine.oeis.triangle.Inverse;

/**
 * A102220 Triangular matrix, read by rows, equal to [2*I - A008459]^(-1), i.e., the matrix inverse of the difference of twice the identity matrix and the triangular matrix of squared binomial coefficients.
 * @author Georg Fischer
 */
public class A102220 extends Inverse {

  /** Construct the sequence. */
  public A102220() {
    super(0, new Sequence0() {
      private final A023531 mSeq1 = new A023531();
      private final A008459 mSeq2 = new A008459();

      @Override
      public Z next() {
        return mSeq1.next().multiply2().subtract(mSeq2.next());
      }
    });
  }
}
