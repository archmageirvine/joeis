package irvine.oeis.a034;

import irvine.math.group.Monster;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034389 Multiplicity of highest weight (or singular) vectors associated with character chi_1 of Monster module.
 * @author Sean A. Irvine
 */
public class A034389 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final int mConjugacyClass;
  private final Polynomial<Z> mHeadCharacters = RING.empty();
  private int mN = -1;

  protected A034389(final int conjugacyClass) {
    mConjugacyClass = conjugacyClass;
  }

  /** Construct the sequence. */
  public A034389() {
    this(1);
  }

  private void stepHeadCharacters(final int n) {
    Z r = Z.ZERO;
    for (int j = 1; j <= Monster.NUMBER_CONJUCACY_CLASSES; ++j) {
      r = r.add(Monster.ORDER.divide(Monster.centralizerOrder(j)).multiply(Monster.chi(mConjugacyClass, j)).multiply(Monster.mckayThompson(j).a(n)));
    }
    mHeadCharacters.add(r.divide(Monster.ORDER));
  }

  @Override
  public Z next() {
    stepHeadCharacters(++mN);
    return RING.multiply(mHeadCharacters, RING.eta(RING.x(), mN), mN).coeff(mN);
  }
}
