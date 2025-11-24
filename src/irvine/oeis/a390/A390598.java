package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A390598 allocated for Marco Rip\u00e0.
 * @author Sean A. Irvine
 */
public class A390598 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z a(final Z n) {
    if (n.isZero() || n.isOne()) {
      return Z.ZERO;
    }
    final int r = (int) n.mod(6);
    final Z n1 = n.square().subtract(1);
    switch (r) {
      case 1:
      case 5:
        return Functions.VALUATION.z(n1, 2).min(Functions.VALUATION.z(n1, 3));
      case 3:
        return Functions.VALUATION.z(n1, 2).subtract(1);
      case 2:
      case 4:
        return Functions.VALUATION.z(n1, 3);
      default:
        return Z.NEG_ONE;
    }
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}

