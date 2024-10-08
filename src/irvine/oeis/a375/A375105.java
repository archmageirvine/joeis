package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-08-09.ack/lambdan at 2024-08-10 19:00

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.oeis.LambdaSequence;

/**
 * A375105 a(n) = (2*n)^(n-2)*(2*n)!/n!.
 * @author Georg Fischer
 */
public class A375105 extends LambdaSequence {

  /** Construct the sequence. */
  public A375105() {
    super(1, n -> new Q(2L * n).pow(n - 2).multiply(Functions.FACTORIAL.z(2 * n)).divide(Functions.FACTORIAL.z(n)).num());
  }
}
