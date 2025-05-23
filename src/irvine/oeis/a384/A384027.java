package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-05-22.ack/lambdan at 2025-05-22 22:55

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A384027 a(n) = [x^(3*n)] Product_{k=0..n-1} (1 + k*x)^4.
 * @author Georg Fischer
 */
public class A384027 extends LambdaSequence {

  /** Construct the sequence. */
  public A384027() {
    super(0, n -> Integers.SINGLETON.sum(0, n, i -> Integers.SINGLETON.sum(0, n - i, j -> Integers.SINGLETON.sum(0, n - i - j, k -> (Functions.STIRLING1.z(n, i).multiply(Functions.STIRLING1.z(n, j)).multiply(Functions.STIRLING1.z(n, k)).multiply(Functions.STIRLING1.z(n, n - i - j - k))).abs()))));
  }
}
