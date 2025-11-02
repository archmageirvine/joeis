package irvine.oeis.a089;

import java.util.HashSet;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A089477 Smallest positive integer not the permanent of a real {0,1}-matrix of order n.
 * @author Sean A. Irvine
 */
public class A089477 extends Sequence1 {

  // Only good for 4 or 5 terms

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final DefaultMatrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    final MatrixField<Q> fld = new MatrixField<>(mN, Rationals.SINGLETON);
    final HashSet<Z> seen = new HashSet<>();
    for (long content = 0; content < 1L << (mN * mN); ++content) {
      long e = content;
      for (long r = 0; r < mN; ++r) {
        for (long c = 0; c < mN; ++c, e >>>= 1) {
          m.set(r, c, (e & 1) == 0 ? Q.ZERO : Q.ONE);
        }
      }
      final Q permanent = fld.permanent(m);
      if (permanent.isInteger()) {
        seen.add(permanent.toZ());
      }
    }
    Z t = Z.ZERO;
    while (true) {
      t = t.add(1);
      if (!seen.contains(t)) {
        return t;
      }
    }
  }
}
