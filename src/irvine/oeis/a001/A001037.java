package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A001037 Number of degree-n irreducible polynomials over GF(2); number of n-bead necklaces with beads of 2 colors when turning over is not allowed and with primitive period n; number of binary Lyndon words of length n.
 * @author Sean A. Irvine
 */
public class A001037 extends AbstractSequence implements DirectSequence {

  protected A001037(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001037() {
    super(0);
  }

  protected int mN = -1;

  @Override
  public Z a(final Z n) {
    if (n.isZero()) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final Z z = Z.ONE.shiftLeft(dd.longValueExact());
      sum = sum.add(z.multiply(Functions.MOBIUS.i(n.divide(dd))));
    }
    return sum.divide(n);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
