package irvine.oeis.a334;
// Generated by gen_seq4.pl 2024-07-01/lambdan at 2024-07-01 18:26

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.oeis.LambdaSequence;

/**
 * A334762 a(n) = ceiling (n / A000005(n)).
 * @author Georg Fischer
 */
public class A334762 extends LambdaSequence {

  /** Construct the sequence. */
  public A334762() {
    super(1, n -> new Q(n, Functions.SIGMA0.z(n)).ceiling());
  }
}
