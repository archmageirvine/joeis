package irvine.oeis.a324;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A324542 M\u00f6bius transform of A324118, where A324118(n) = A000593(A156552(n)).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A324542 extends Sequence1 implements DirectSequence {

  private static final DirectSequence A324118 = new A324118();
  private long mN = 0;

  @Override
  public Z a(final Z n) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(Functions.MOBIUS.z(n.divide(d)).multiply(A324118.a(d)));
    }
    return sum;
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
