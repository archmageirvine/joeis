package irvine.oeis.a318;
// Generated by gen_seq4.pl 2024-12-20.ack/lambdan at 2024-12-20 14:00

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A318060 a(n) is the denominator of sigma(sigma(n))/n.
 * @author Georg Fischer
 */
public class A318060 extends LambdaSequence {

  /** Construct the sequence. */
  public A318060() {
    super(1, n -> new Q(Functions.SIGMA1.z(Functions.SIGMA1.z(n)), Z.valueOf(n)).den());
  }
}
