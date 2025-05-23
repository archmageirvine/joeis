package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-05-22.ack/lambdan at 2025-05-22 22:55

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A384018 a(n) = [x^n] Product_{k=0..n-1} (1 + k*x)^3.
 * @author Georg Fischer
 */
public class A384018 extends LambdaSequence {

  /** Construct the sequence. */
  public A384018() {
    super(0, n -> Integers.SINGLETON.sum(0, n, i -> Integers.SINGLETON.sum(0, 2 * n - i, j -> (Functions.STIRLING1.z(n, i).multiply(Functions.STIRLING1.z(n, j)).multiply(Functions.STIRLING1.z(n, 2 * n - i - j))).abs())));
  }
}
