package irvine.oeis.a354;

import irvine.math.group.IntegersMod;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A354139.
 * @author Sean A. Irvine
 */
public class A354139 implements Sequence {

  // After Michel Marcus

  private int mN = 0;

  private boolean is(final int n, final int k) {
    final PolynomialRing<Z> ring = new PolynomialRing<>(new IntegersMod(n));
    Polynomial<Z> sum = ring.zero();
    for (int j = 1; j <= k; ++j) {
      sum = ring.add(sum, ring.pow(Polynomial.create(j, 1), n));
    }
    if (sum.equals(ring.zero())) {
      return true;
    }
    for (int j = 1; j <= n; ++j) {
      if (!ring.eval(sum, Z.valueOf(j)).isZero()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (!is(mN, ++k)) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
