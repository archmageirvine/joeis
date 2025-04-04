package irvine.oeis.a337;
// Generated by gen_seq4.pl 2025-03-12.ack/wpartsum at 2025-03-12 21:05

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A337931 Number of ways to write n as the sum of two positive integers, s,t such that phi(s) is not equal to phi(t), where phi is the Euler totient function (A000010).
 * @author Georg Fischer
 */
public class A337931 extends LambdaSequence {

  /** Construct the sequence. */
  public A337931() {
    super(1, n -> Integers.SINGLETON.sum(1, n / 2, i -> Z.valueOf(1 - (Functions.PHI.i(i) == Functions.PHI.i(n - i) ? 1 : 0))));
  }
}
