package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000016 a(n) is the number of distinct (infinite) output sequences from binary n-stage shift register which feeds back the complement of the last stage.
 * @author Sean A. Irvine
 */
public class A000016 extends AbstractSequence {

  /* Construct the sequence. */
  public A000016() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ONE;
    }
    final Z n = Z.valueOf(mN);
    final FactorSequence fs = Jaguar.factor(n);
    Z sum = Z.ZERO;
    for (final Z d : fs.divisors()) {
      final int i = d.intValue();
      if ((i & 1) == 1) {
        sum = sum.add(Z.valueOf(Euler.phiAsLong(i)).shiftLeft(mN / i));
      }
    }
    return sum.divide(2L * mN);
  }
}

