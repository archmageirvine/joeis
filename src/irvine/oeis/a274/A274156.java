package irvine.oeis.a274;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A274156 Number of integers in n-th generation of tree T(2^(-1/2)) defined in Comments.
 * @author Georg Fischer
 */
public class A274156 extends AbstractSequence {

  private int mN;
  private CR mR;
  private Set<Polynomial<CR>> mT = new HashSet<>();
  private Set<Polynomial<CR>> mG = new HashSet<>();
  private Set<Polynomial<CR>> mH = new HashSet<>();
  private static final PolynomialRingField<CR> RING = new PolynomialRingField<>(ComputableReals.SINGLETON);

  /** Construct the sequence. */
  public A274156() {
    this(0, CR.TWO.pow(new Q(-1, 2)));
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param r value for x
   */
  public A274156(final int offset, final CR r) {
    super(offset);
    mN = -1;
    mR = r;
    mT.add(RING.create(List.of(CR.ONE)));
  }

  /**
   * Add the element to the next generation.
   * @param p1 next element
   * @return whether the element is integer
   */
  private boolean eligible(final Polynomial<CR> p1) {
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
      for (Polynomial<CR> p : mT) {
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
