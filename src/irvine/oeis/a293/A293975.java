package irvine.oeis.a293;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A293975 If n is even, divide by 2; otherwise, add the next larger prime.
 * @author Georg Fischer
 */
public class A293975 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    if (!n.testBit(0)) {
      return n.divide(2);
    }
    return n.add(Puma.nextPrimeZ(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
