package irvine.oeis.a135;
// Generated by gen_seq4.pl 2024-12-20.ack/lambdan at 2024-12-20 14:00

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A135101 Digital sum (base the n-th prime) of n^n.
 * @author Georg Fischer
 */
public class A135101 extends LambdaSequence {

  /** Construct the sequence. */
  public A135101() {
    super(1, n -> Functions.DIGIT_SUM.z(Functions.PRIME.i(n), Z.valueOf(n).pow(n)));
  }
}
