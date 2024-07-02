package irvine.oeis.a071;

import java.util.ArrayList;
import java.util.List;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

/**
 * A071093 Number of perfect matchings in triangle graph with n nodes per side as n runs through numbers congruent to 0 or 3 mod 4.
 * @author Sean A. Irvine
 */
public class A071093 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;

  private Z b(final int n) {
    if (n == 0) {
      return Z.ONE;
    }
    if (n < 0 || (n & 3) == 1 || (n & 3) == 2) {
      return Z.ZERO;
    }

    final List<Pair<Integer, Integer>> l = new ArrayList<>();
    for (int j = 1; j < n; ++j) {
      int h0 = j * (j - 1) / 2 + 1;
      int h1 = j * (j + 1) / 2 + 1;
      for (int i = 1; i <= j; ++i) {
        l.add(new Pair<>(h1, h1 + 1));
        if ((i & 1) == 1) {
          l.add(new Pair<>(h1++, h0));
          l.add(new Pair<>(h1, h0++));
        } else {
          l.add(new Pair<>(h0, h1++));
          l.add(new Pair<>(h0++, h1));
        }
      }
    }
    final int s = n * (n + 1) / 2;
    final Matrix<Q> m = new DefaultMatrix<>(s, s, Q.ZERO);
    for (final Pair<Integer, Integer> ll : l) {
      m.set(ll.left() - 1, ll.right() - 1, Q.ONE);
      m.set(ll.right() - 1, ll.left() - 1, Q.NEG_ONE);
    }
    return new MatrixField<>(s, Rationals.SINGLETON).det(m).toZ().sqrt();
  }

  @Override
  public Z next() {
    return b(2 * ++mN + (mN & 1));
  }
}
