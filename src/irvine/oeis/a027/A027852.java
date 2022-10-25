package irvine.oeis.a027;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A027852 Number of connected functions on n points with a loop of length 2.
 * @author Sean A. Irvine
 */
public class A027852 extends A000081 {

  {
    setOffset(1);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final ArrayList<Z> mSeq = new ArrayList<>();
  private int mN = 0;

  @Override
  public Z next() {
    mSeq.add(super.next());
    final Polynomial<Z> p = RING.create(mSeq);
    ++mN;
    return RING.add(RING.multiply(p, p, mN), p.substitutePower(2, mN)).coeff(mN).divide2();
  }
}

