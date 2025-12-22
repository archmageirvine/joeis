package irvine.oeis.a373;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A373387 Constant congruence speed of the tetration base n (in radix-10), or -1 if n is a multiple of 10.
 * @author Sean A. Irvine
 */
public class A373387 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z a(final Z n) {
    if (n.isZero() || n.isOne()) {
      return Z.ZERO;
    }
    if (n.mod(10) == 0) {
      return Z.NEG_ONE;
    }
    final int r = (int) n.mod(20);
    switch (r) {
      case 1:
        return Functions.VALUATION.z(n.subtract(1), 2).min(Functions.VALUATION.z(n.subtract(1), 5));
      case 11:
        return Functions.VALUATION.z(n.add(1), 2).min(Functions.VALUATION.z(n.subtract(1), 5));
      case 2:
      case 8:
      case 12:
      case 18:
        return Functions.VALUATION.z(n.square().add(1), 5);
      case 3:
      case 7:
        return Functions.VALUATION.z(n.add(1), 2).min(Functions.VALUATION.z(n.square().add(1), 5));
      case 13:
      case 17:
        return Functions.VALUATION.z(n.subtract(1), 2).min(Functions.VALUATION.z(n.square().add(1), 5));
      case 4:
      case 14:
        return Functions.VALUATION.z(n.add(1), 5);
      case 5:
        return Functions.VALUATION.z(n.subtract(1), 2);
      case 15:
        return Functions.VALUATION.z(n.add(1), 2);
      case 6:
      case 16:
        return Functions.VALUATION.z(n.subtract(1), 5);
      case 9:
        return Functions.VALUATION.z(n.subtract(1), 2).min(Functions.VALUATION.z(n.add(1), 5));
      case 19:
        return Functions.VALUATION.z(n.add(1), 2).min(Functions.VALUATION.z(n.add(1), 5));
      default:
        return Z.ZERO;
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

