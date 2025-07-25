package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-05-14/lambdan at 2024-05-14 21:53

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A372710 a(n) = Sum_{k=1..n} sigma(n*k).
 * @author Georg Fischer
 */
public class A372710 extends LambdaSequence {

  /** Construct the sequence. */
  public A372710() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Functions.SIGMA1.z(n * k)));
  }
}
