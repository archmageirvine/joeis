package irvine.oeis.a098;
// Generated by gen_seq4.pl 2024-11-01.ack/lambdan at 2024-11-01 22:07

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A098231 2^p - 11 for p prime.
 * @author Georg Fischer
 */
public class A098231 extends LambdaSequence {

  /** Construct the sequence. */
  public A098231() {
    super(1, n -> Z.TWO.pow(Functions.PRIME.i(n)).subtract(11));
  }
}
