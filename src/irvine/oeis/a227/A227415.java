package irvine.oeis.a227;
// Generated by gen_seq4.pl 2024-06-17/lambdan at 2024-06-17 23:19

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A227415 a(n) = (n+1)!! mod n!!.
 * @author Georg Fischer
 */
public class A227415 extends LambdaSequence {

  /** Construct the sequence. */
  public A227415() {
    super(0, n -> Functions.MULTIFACTORIAL.z(2, n + 1).mod(Functions.MULTIFACTORIAL.z(2, n)));
  }
}
