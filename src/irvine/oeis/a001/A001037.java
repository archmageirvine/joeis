package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A001037 Number of degree-n irreducible polynomials over GF(2); number of n-bead necklaces with beads of 2 colors when turning over is not allowed and with primitive period n; number of binary Lyndon words of length n.
 * @author Sean A. Irvine
 */
public class A001037 extends AbstractSequence {

  /** Construct the sequence. */
  public A001037() {
    super(0);
  }

  protected int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      final Z z = Z.ONE.shiftLeft(d);
      sum = ZUtils.mobiusAdd(Mobius.mobius(mN / d), sum, z);
    }
    return sum.divide(mN);
  }
}
