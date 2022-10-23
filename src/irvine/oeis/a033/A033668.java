package irvine.oeis.a033;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004016;

/**
 * A033668 Theta series of 4-dimensional lattice A_2 tensor A2, with det 81, minimal norm 4.
 * @author Sean A. Irvine
 */
public class A033668 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Sequence mA2 = new A004016();
  private final Sequence mA2DeepHole = new A033685();
  private final Polynomial<Z> mA = RING.empty();
  private final Polynomial<Z> mB = RING.empty();
  private int mN = -1;
  
  @Override
  public Z next() {
    ++mN;
    // effectively subs power x^3
    mA.add(mA2.next());
    mA.add(Z.ZERO);
    mA.add(Z.ZERO);
    // ordinary powers of x
    mB.add(mA2DeepHole.next());
    return RING.pow(mA, 2, mN).coeff(mN).add(RING.pow(mB, 2, mN).coeff(mN).multiply2());
  }
}
