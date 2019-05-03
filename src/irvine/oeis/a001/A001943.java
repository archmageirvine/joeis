package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001943 Expansion of reciprocal of theta series of <code>E_8</code> lattice.
 * @author Sean A. Irvine
 */
public class A001943 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    // Without this reciprocal this is A004009
    return RING.coeff(RING.one(), A001942.f(mN), mN);
  }
}
