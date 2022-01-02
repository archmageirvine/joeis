package irvine.oeis.a053;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053604 Number of ways to write n as an ordered sum of 3 nonzero triangular numbers.
 * @author Sean A. Irvine
 */
public class A053604 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private int mT = 1;
  private int mM = 1;
  private final Polynomial<Z> mA = RING.empty();

  @Override
  public Z next() {
    if (++mN == mT) {
      mA.add(Z.ONE);
      mT = ++mM * (mM + 1) / 2;
    } else {
      mA.add(Z.ZERO);
    }
    return RING.pow(mA, 3, mN).coeff(mN);
  }
}
