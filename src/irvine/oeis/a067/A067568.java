package irvine.oeis.a067;

import irvine.math.group.IntegersMod;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000009;
import irvine.util.string.StringUtils;

/**
 * A067568 Numbers n such that A000009(n) divides A022629(n).
 * @author Sean A. Irvine
 */
public class A067568 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Sequence mB = new A000009();
  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z mod = mB.next();
      final PolynomialRing<Z> ring = new PolynomialRing<>(new IntegersMod(mod));
      Polynomial<Z> prod = ring.one();
      for (int k = 0; k <= mN; ++k) {
        prod = ring.multiply(prod, ring.onePlusXToTheN(Z.valueOf(k), k), mN);
      }
      if (prod.coeff(mN).isZero()) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 1000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}

