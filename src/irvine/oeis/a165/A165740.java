package irvine.oeis.a165;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A165740 Positive integers n such that solution to the toric <code>n X n</code> "Lights Out" puzzle is not unique (up to the order of flippings; each flipping appears at most <code>once)</code>.
 * @author Sean A. Irvine
 */
public class A165740 implements Sequence {

  // Cf. http://www.win.tue.nl/~aeb/preprints/madaart2c.pdf

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(new GaloisField(2));
  private Polynomial<Z> mA = RING.zero();
  private Polynomial<Z> mB = RING.one();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Polynomial<Z> t = RING.add(RING.multiply(mB, RING.x()), mA);
      mA = mB;
      mB = t;
      final Polynomial<Z> g = mB.shift(1);
      final Polynomial<Z> h = RING.substitute(g, RING.onePlusXToTheN(1), g.degree());
      if (!RING.one().equals(RING.gcd(g, h))) {
        return Z.valueOf(mN);
      }
    }
  }
}
