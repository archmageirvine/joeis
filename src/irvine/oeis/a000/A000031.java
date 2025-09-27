package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000031 Number of n-bead necklaces with 2 colors when turning over is not allowed; also number of output sequences from a simple n-stage cycling shift register; also number of binary irreducible polynomials whose degree divides n.
 * @author Sean A. Irvine
 */
public class A000031 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000031(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000031() {
    super(0);
  }

  protected int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }


  @Override
  public Z a(final Z n) {
    if (n.compareTo(Z.FOUR) < 0) {
      return n.add(1);
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(Functions.PHI.z(d).shiftLeft(n.longValue() / d.longValue()));
    }
    return sum.divide(n);
  }

  @Override
  public Z a(final int n) {
    if (n < 4) {
      return Z.valueOf(n + 1);
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(Functions.PHI.z(d).shiftLeft(n / d.longValue()));
    }
    return sum.divide(n);
  }

}

