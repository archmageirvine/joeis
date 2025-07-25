package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-05-29.ack/lambdan at 2025-05-29 22:38

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A383874 a(n) = (3*n+1)!*(3*n)!/((2*n)!*((n+1)!)^2).
 * @author Georg Fischer
 */
public class A383874 extends LambdaSequence {

  /** Construct the sequence. */
  public A383874() {
    super(0, n -> Functions.FACTORIAL.z(3 * n + 1).multiply(Functions.FACTORIAL.z(3 * n)).divide(Functions.FACTORIAL.z(2 * n).multiply(Functions.FACTORIAL.z(n + 1).square())));
  }
}
