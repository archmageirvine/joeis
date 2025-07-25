package irvine.oeis.a096;
// Generated by gen_seq4.pl 2025-06-15.ack/rambdan at 2025-06-15 21:33

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.RationalLambdaSequence;

/**
 * A096430 Numerator of (9*(n^4 - 2*n^3 + 2*n^2 - n) + 2)/(2*(2*n-1)).
 * @author Georg Fischer
 */
public class A096430 extends RationalLambdaSequence {

  /** Construct the sequence. */
  public A096430() {
    super(1, NUM, n -> new Q(Z.valueOf(9 * n).multiply(Z.valueOf(n).multiply(Z.valueOf(n).multiply(n - 2).add(2)).subtract(1)).add(2), Z.valueOf(2 * (2 * n - 1))));
  }
}
