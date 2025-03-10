package irvine.oeis.a274;

import java.util.ArrayList;
import java.util.Collection;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A274142 Number of integers in n-th generation of tree T(1/2) defined in Comments.
 * @author Georg Fischer
 */
public class A274142 extends AbstractSequence {

  protected int mN;
  private final Q mR;
  private Collection<Polynomial<Q>> mT = new ArrayList<>();
  private Collection<Polynomial<Q>> mG = new ArrayList<>();
  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  /** Construct the sequence. */
  public A274142() {
    this(0, new Q(1, 2));
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param r value for x
   */
  public A274142(final int offset, final Q r) {
    super(offset);
    mN = -1;
    mR = r;
    mT.add(Polynomial.create(Q.ONE));
  }

  /**
   * Add the element to the next generation.
   * @param p1 next element
   * @return whether the element is integer
   */
  private boolean eligible(final Polynomial<Q> p1) {
    final boolean res = RING.eval(p1, mR).isInteger();
    if (res) {
      mG.add(p1);
    }
    return res;
  }

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    if (mN <= 1) {
      sum = 1;
    } else {
      mG.clear();
      for (final Polynomial<Q> p : mT) {
        if (eligible(RING.add(p, RING.one()))) {
          ++sum;
        }
        if (eligible(p.shift(1))) {
          ++sum;
        }
      }
      final Collection<Polynomial<Q>> h = mT;
      mT = mG;
      mG = h;
    }
    return Z.valueOf(sum);
  }
}
