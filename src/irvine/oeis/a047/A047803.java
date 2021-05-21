package irvine.oeis.a047;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004009;
import irvine.oeis.a022.A022047;

/**
 * A047803 Theta series of 24-dimensional lattice D_16 + E_8.
 * @author Sean A. Irvine
 */
public class A047803 extends A004009 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mE8 = RING.empty();
  private final Polynomial<Z> mD16 = RING.empty();
  private final Sequence mD16Seq = new A022047();
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    mE8.add(super.next());
    mE8.add(Z.ZERO);
    mD16.add(mD16Seq.next());
    mD16.add(Z.ZERO);
    return RING.multiply(mE8, mD16, mN).coeff(mN);
  }
}
