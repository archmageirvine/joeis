package irvine.oeis.a359;
// manually 2024-06-20

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a048.A048103;

/**
 * A359550 Characteristic function of A048103; From n &gt;= 1, a(n) is multiplicative with a(p^e) = 1 if p &gt; e, otherwise 0. a(0) = 0 by convention.
 * @author Georg Fischer
 */
public class A359550 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z a(final Z n) {
    return n.isZero() ? Z.ZERO : A048103.isOk(Jaguar.factor(n)) ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
