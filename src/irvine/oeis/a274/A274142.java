package irvine.oeis.a274;

import java.util.HashSet;
import java.util.Set;

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
  private Q mR;
  private Set<Polynomial<Q>> mT = new HashSet<>();
  private Set<Polynomial<Q>> mG = new HashSet<>();
  private Set<Polynomial<Q>> mH = new HashSet<>();
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
    mG.add(p1);
    return RING.eval(p1, mR).isInteger();
  }

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    if (mN <= 1) {
      sum = 1;
    } else {
      mG.clear();
      for (Polynomial<Q> p : mT) {
        if (eligible(RING.add(p, RING.one()))) {
          ++sum;
        }
        if (eligible(RING.multiply(p, RING.x()))) {
          ++sum;
        }
      }
      mH = mT;
      mT = mG;
      mG = mH;
    }
    return Z.valueOf(sum);
  }
}
