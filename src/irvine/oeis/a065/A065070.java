package irvine.oeis.a065;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;

/**
 * A065070 Rank transform of sequence {pi(m)} = A000720.
 * @author Sean A. Irvine
 */
public class A065070 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Q[][] e = new Q[++mN][mN];
    final Sequence pi = new A000720();
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        e[k][j] = new Q(pi.next());
      }
    }
    final DefaultMatrix<Q> m = new DefaultMatrix<>(e, Q.ZERO);
    final MatrixField<Q> field = new MatrixField<>(mN, Rationals.SINGLETON);
    return Z.valueOf(field.rank(m));
  }
}

