package irvine.oeis;

import java.util.ArrayList;
import java.util.Collection;

import irvine.math.api.IsInteger;
import irvine.math.api.Ring;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * Generate trees needed for A274160 and related sequences.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class KimberlingTreeSequence<E extends IsInteger<E>> extends AbstractSequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN;
  private final E mR;
  private final Ring<E> mEvaluationRing;
  private Collection<Polynomial<Z>> mT = new ArrayList<>();
  private Collection<Polynomial<Z>> mG = new ArrayList<>();
  private final boolean mKeepOnlyIntegerCases;

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param r value for x
   * @param keepOnlyIntegerCases at each step only retain cases where the evaluation is an integer
   */
  protected KimberlingTreeSequence(final int offset, final Ring<E> evaluationRing, final E r, final boolean keepOnlyIntegerCases) {
    super(offset);
    mEvaluationRing = evaluationRing;
    mKeepOnlyIntegerCases = keepOnlyIntegerCases;
    mN = -1;
    mR = r;
    mT.add(RING.one());
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param r value for x
   */
  protected KimberlingTreeSequence(final int offset, final Ring<E> evaluationRing, final E r) {
    this(offset, evaluationRing, r, false);
  }

  /**
   * Add the element to the next generation.
   * @param p next element
   * @return whether the element is integer
   */
  private boolean eligible(final Polynomial<Z> p) {
    final boolean e = PolynomialUtils.eval(mEvaluationRing, p, mR).isInteger();
    if (!mKeepOnlyIntegerCases || e) {
      mG.add(p);
    }
    return e;
  }

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    if (mN <= 1) {
      sum = 1;
    } else {
      mG.clear();
      for (final Polynomial<Z> p : mT) {
        if (eligible(RING.add(p, RING.one()))) {
          ++sum;
        }
        if (eligible(p.shift(1))) {
          ++sum;
        }
      }
      final Collection<Polynomial<Z>> h = mT;
      mT = mG;
      mG = h;
    }
    //System.out.println(mG);
    return Z.valueOf(sum);
  }
}
