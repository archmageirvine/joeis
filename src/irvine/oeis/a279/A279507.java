package irvine.oeis.a279;
// Generated by gen_seq4.pl 2024-11-22.ack/lambdan at 2024-11-22 22:47

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A279507 a(n) = floor(phi(n)/tau(n)).
 * @author Georg Fischer
 */
public class A279507 extends LambdaSequence {

  /** Construct the sequence. */
  public A279507() {
    super(1, n -> Functions.PHI.z(n).divide(Functions.SIGMA0.z(n)));
  }
}
