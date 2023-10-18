package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000593 Sum of odd divisors of n.
 * @author Sean A. Irvine
 */
public class A000593 extends AbstractSequence implements DirectSequence {

  /** Construct the sequence. */
  public A000593() {
    super(1);
  }

  /**
   * Constructor with offset.
   * @param offset first index of subclass
   */
  public A000593(final int offset) {
    super(offset);
  }

  protected long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      if (!Z.TWO.equals(p)) {
        final int e = fs.getExponent(p);
        prod = prod.multiply(p.pow(e + 1).subtract(1)).divide(p.subtract(1));
      }
    }
    return prod;
  }

  @Override
  public Z a(final int n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      if (!Z.TWO.equals(p)) {
        final int e = fs.getExponent(p);
        prod = prod.multiply(p.pow(e + 1).subtract(1)).divide(p.subtract(1));
      }
    }
    return prod;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

}

