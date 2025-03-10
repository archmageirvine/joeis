package irvine.oeis.a274;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
  private final CR mR;
  private Collection<Polynomial<CR>> mT = new ArrayList<>();
  private Collection<Polynomial<CR>> mG = new ArrayList<>();
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
      for (final Polynomial<CR> p : mT) {
        if (eligible(RING.add(p, RING.one()))) {
          ++sum;
        }
        if (eligible(p.shift(1))) {
          ++sum;
        }
      }
      final Collection<Polynomial<CR>> h = mT;
      mT = mG;
      mG = h;
    }
    return Z.valueOf(sum);
  }
}
