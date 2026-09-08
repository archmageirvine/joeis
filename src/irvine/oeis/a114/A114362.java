package irvine.oeis.a114;
// manually 2026-09-08/rambdan at 2026-09-08 08: 47

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.RationalLambdaSequence;

/**
 * A114362 Numerator of zeta(4n)/zeta(2n)^2 (with a(0)=2 instead of -2).
 * @author Georg Fischer
 */
public class A114362 extends RationalLambdaSequence {

  /// z(n)=bernfrac(2*n)*(-1)^(n - 1)*2^(2*n-1)/(2*n)!;
  protected static Q zb(final long n) {
    return Functions.BERNOULLI.q(2 * n).multiply(((n - 1) & 1) == 0 ? 1 : -1).multiply(Z.ONE.shiftLeft(2 * n - 1)).divide(Functions.FACTORIAL.z(2 * n));
  }

  /** Construct the sequence. */
  public A114362() {
    // a(n)=if(n<1, 2, numerator(z(2*n)/z(n)^2))
    super(0, NUM, n -> n < 1 ? Q.TWO : zb(2 * n).divide(zb(n).square()));
  }

  protected static Q aq(final long n) {
    return n < 1 ? Q.TWO : zb(2 * n).divide(zb(n).square());
  }
}
