package irvine.oeis.a032;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032101 Number of dyslexic identity planted planar trees with n+1 nodes.
 * @author Sean A. Irvine
 */
public class A032101 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mA = RING.empty();
  private int mN = 0;
  {
    mA.add(Z.ZERO);
  }

  static Polynomial<Z> bhk(final Polynomial<Z> p) {
    final Polynomial<Z> t = RING.subtract(RING.one(), p);
    final Polynomial<Z> u = RING.series(RING.add(RING.one(), p), t.substitutePower(2, p.degree()), p.degree());
    final Polynomial<Z> v = RING.series(RING.one(), t, p.degree());
    return RING.add(p, RING.divide(RING.subtract(v, u), Z.TWO));
  }

  protected Z start() {
    return Z.ONE;
  }

  @Override
  public Z next() {
    if (++mN < 3) {
      mA.add(start());
      return start();
    }
    final Z t = bhk(mA).coeff(mN - 1);
    mA.add(t);
    return t;
  }
}
