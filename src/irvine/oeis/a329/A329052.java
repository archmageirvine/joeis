package irvine.oeis.a329;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A329052 Array read by antidiagonals: T(n,m) is the number of unlabeled bicolored acyclic graphs with n nodes of one color and m of the other.
 * @author Gregory Morse
 */
public class A329052 extends A329054 {
  private Polynomial<Polynomial<Q>> mForests;
  private int mSize = 0;

  @Override
  protected Z t(final int n, final int m) {
    final int size = n + m;
    if (size == 0) {
      return Z.ONE;
    }
    if (size > mSize) {
      mForests = euler(trees(size));
      mSize = size;
    }
    return mForests.coeff(size).coeff(m).toZ();
  }
}
