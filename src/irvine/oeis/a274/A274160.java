package irvine.oeis.a274;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A274160 Number of integers in n-th generation of tree T(i) defined in Comments.
 * @author Georg Fischer
 */
public class A274160 extends AbstractSequence {

  private int mN;
  private final CC mR;
  private Collection<Polynomial<CC>> mT = new HashSet<>();
  private Collection<Polynomial<CC>> mG = new HashSet<>();
  private static final PolynomialRingField<CC> RING = new PolynomialRingField<>(ComputableComplexField.SINGLETON);

  /** Construct the sequence. */
  public A274160() {
    this(0, CC.I);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param r value for x
   */
  public A274160(final int offset, final CC r) {
    super(offset);
    mN = -1;
    mR = r;
    mT.add(RING.create(List.of(CC.ONE)));
  }

  /**
   * Add the element to the next generation.
   * @param p1 next element
   * @return whether the element is integer
   */
  private boolean eligible(final Polynomial<CC> p1) {
    mG.add(p1);
    final CC e = RING.eval(p1, mR);
    return e.im().compareTo(CR.ZERO, -32) == 0 && e.re().isInteger();
  }

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    if (mN <= 1) {
      sum = 1;
    } else {
      mG.clear();
      for (final Polynomial<CC> p : mT) {
        if (eligible(RING.add(p, RING.one()))) {
          ++sum;
        }
        if (eligible(p.shift(1))) {
          ++sum;
        }
      }
      final Collection<Polynomial<CC>> h = mT;
      mT = mG;
      mG = h;
    }
    return Z.valueOf(sum);
  }
}
