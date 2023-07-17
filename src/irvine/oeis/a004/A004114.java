package irvine.oeis.a004;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A004114 Number of trees with n nodes and 2-colored internal (non-leaf) nodes.
 * @author Sean A. Irvine
 */
public class A004114 extends A004113 {

  /** Construct the sequence. */
  public A004114() {
    super(0);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final ArrayList<Z> mB = new ArrayList<>();

  {
    mB.add(Z.ZERO);
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mB.add(super.next());
    final Polynomial<Z> g = RING.create(mB);
    return RING.add(RING.subtract(RING.add(RING.one(), g), g.shift(1)), RING.divide(RING.subtract(g.substitutePower(2), RING.pow(g, 2, mN)), Z.TWO)).coeff(mN);
  }
}
