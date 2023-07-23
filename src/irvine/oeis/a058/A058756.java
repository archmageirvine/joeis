package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000084;

/**
 * A058756 G.f. is (1-S)/(1+S), where S = g.f. for A000084.
 * @author Sean A. Irvine
 */
public class A058756 extends AbstractSequence {

  private final A000084 mSeq1 = new A000084();

  /** Construct the sequence. */
  public A058756() {
    super(0);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mA = RING.empty();
  private final Polynomial<Z> mB = RING.empty();
  private int mN = -1;

  {
    mA.add(Z.ONE);
    mB.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z s = mSeq1.next();
    mA.add(s.negate());
    mB.add(s);
    return RING.coeff(mA, mB, ++mN);
  }
}
