package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-06-16.ack/lambdan at 2025-06-16 21:55

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A384525 Expansion of e.g.f. 5/(6 - exp(5*x)).
 * @author Georg Fischer
 */
public class A384525 extends LambdaSequence {

  /** Construct the sequence. */
  public A384525() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.FIVE.pow(n - k).multiply(Functions.FACTORIAL.z(k)).multiply(Functions.STIRLING2.z(n, k))));
  }
}
