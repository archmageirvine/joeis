package irvine.oeis.a039;

import java.util.Arrays;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039826 Largest coefficient in expansion of Product_{i=1..n} (1 + q^i + q^(2i)).
 * @author Sean A. Irvine
 */
public class A039826 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mProduct = RING.one();
  private int mN = 0;

  @Override
  public Z next() {
    final Z[] t = new Z[2 * ++mN + 1];
    Arrays.fill(t, Z.ZERO);
    t[0] = Z.ONE;
    t[mN] = Z.ONE;
    t[2 * mN] = Z.ONE;
    mProduct = RING.multiply(mProduct, Polynomial.create(t));
    Z max = Z.ZERO;
    for (final Z v : mProduct) {
      max = max.max(v);
    }
    return max;
  }
}
