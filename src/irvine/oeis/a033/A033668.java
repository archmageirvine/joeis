package irvine.oeis.a033;

import java.util.Collections;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004016;

/**
 * A033668 Theta series of 4-dimensional lattice <code>A_2</code> tensor <code>A2</code>, with det 81, minimal norm 4.
 * @author Sean A. Irvine
 */
public class A033668 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Sequence mA2 = new A004016();
  private final Sequence mA2DeepHole = new A033685();
  private final Polynomial<Z> mA = RING.create(Collections.emptyList());
  private final Polynomial<Z> mB = RING.create(Collections.emptyList());
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
