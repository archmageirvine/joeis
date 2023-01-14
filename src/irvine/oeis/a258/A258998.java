package irvine.oeis.a258;

import irvine.math.z.Z;
import irvine.oeis.a002.A002448;

/**
 * A258998 a(n) = -(-1)^n if n = k^2 for positive integer k, otherwise 0.
 * @author Georg Fischer
 */
public class A258998 extends A002448 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z result = super.next().divide(-2);
    return (mN == 0) ? Z.ZERO : result;
  }
}
