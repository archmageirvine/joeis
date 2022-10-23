package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000188 (1) Number of solutions to x^2 == 0 (mod n). (2) Also square root of largest square dividing n. (3) Also max_{ d divides n } gcd(d, n/d).
 * @author Sean A. Irvine
 */
public class A000188 extends Sequence1 {

  private int mN = 0;
  private final int mA, mB;

  A000188(final int a, final int b) {
    mA = a;
    mB = b;
  }

  /** Construct the sequence. */
  public A000188() {
    this(1, 2);
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z r = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      r = r.multiply(p.pow(mA * e / mB));
    }
    return r;
  }
}

