package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A134467 a(n) = n(n+1) - A000120(n), where A000120(n) = number of 1&apos;s in binary expansion of n.
 * @author Georg Fischer
 */
public class A134467 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.multiply(mN + 1).subtract(n.bitCount());
  }
}
