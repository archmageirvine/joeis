package irvine.oeis.a395;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395116.
 * @author Sean A. Irvine
 */
public class A395116 extends Sequence1 {

  private static final Z NEG4 = Z.valueOf(-4);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final PolynomialRingField<Z> ring = new PolynomialRingField<>(IntegerField.SINGLETON);
    Polynomial<Z> inner = ring.zero();
    Polynomial<Z> poch = ring.one();
    for (int r = 0; r < mN; ++r) {
      if (r > 0) {
        poch = ring.multiply(poch, ring.onePlusXToTheN(r));
      }
      inner = ring.add(inner, ring.multiply(poch, poch).shift(r + 1));
    }
    final Polynomial<Z> l = ring.multiply(inner, NEG4);
    final Polynomial<Z> phi = CyclotomicPolynomials.cyclotomic(2L * mN);
    final Z norm = ring.resultant(l, phi).abs();
    return norm.makeOdd();
  }
}
