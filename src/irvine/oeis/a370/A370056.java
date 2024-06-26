package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-02-13/lambdan at 2024-02-13 21:05

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A370056 a(n) = 2*(4*n+1)!/(3*n+2)!.
 * @author Georg Fischer
 */
public class A370056 extends LambdaSequence {

  /** Construct the sequence. */
  public A370056() {
    super(0, n -> Functions.FACTORIAL.z(4 * n + 1).multiply(2).divide(Functions.FACTORIAL.z(3 * n + 2)));
  }
}
