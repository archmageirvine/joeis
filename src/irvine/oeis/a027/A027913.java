package irvine.oeis.a027;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027913 T(n,[ n/2 ]), T given by A027907.
 * @author Sean A. Irvine
 */
public class A027913 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, 1, 1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.pow(C, mN, mN / 2).coeff(mN / 2);
  }
}
