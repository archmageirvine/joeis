package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A084317 Concatenation of the prime factors of n, in increasing order.
 * @author Sean A. Irvine
 */
public class A084317 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    if (n.isZero() || n.isOne()) {
      return Z.ZERO;
    }
    final StringBuilder sb = new StringBuilder();
    for (final Z p : Jaguar.factor(n).toZArray()) {
      sb.append(p);
    }
    return new Z(sb);
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }
}
