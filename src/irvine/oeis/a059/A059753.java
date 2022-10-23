package irvine.oeis.a059;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A059753 Minimal degree of a height one multiple of (x-1)^n.
 * @author Sean A. Irvine
 */
public class A059753 extends Sequence1 {

  // This is a simple exhaustive search. Only good for a few terms.

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X1 = Polynomial.create(-1, 1);
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private int mM = 1;

  private boolean isSolvable(final Polynomial<Z> mod, final int degree) {
    // leading coefficient wlog is 1, others in {1, 0, -1}
    final long[] coeffs = new long[degree + 1];
    coeffs[degree] = 1;
    final long limit = Z.THREE.pow(degree - 1).longValueExact();
    for (long t = 0; t < limit; ++t) {
      if (t % 3 != 1) { // constant term cannot be 0
        long u = t;
        for (int k = 0; k < degree; ++k) {
          coeffs[k] = (u % 3) - 1;
          u /= 3;
        }
        final Polynomial<Z> p = Polynomial.create(coeffs);
        if (RING.mod(p, mod).equals(RING.zero())) {
          if (mVerbose) {
            StringUtils.message("Found solution: " + p);
          }
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    final Polynomial<Z> mod = RING.pow(X1, ++mN);
    while (!isSolvable(mod, mM)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
