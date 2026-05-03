package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A085307 a(1) = 1; for n &gt; 1, concatenate distinct prime factors of n in decreasing order.
 * @author Sean A. Irvine
 */
public class A085307 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    if (n.isOne()) {
      return Z.ONE;
    }
    final Z[] p = Jaguar.factor(n).toZArray();
    final StringBuilder sb = new StringBuilder();
    for (int k = p.length - 1; k >= 0; --k) {
      sb.append(p[k]);
    }
    return new Z(sb);
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }
}
