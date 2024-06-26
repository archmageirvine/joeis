package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-05-14/lambdan at 2024-05-14 21:53

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A372635 a(n) = Sum_{j=1..n} Sum_{k=1..n} phi(j)*phi(k).
 * @author Georg Fischer
 */
public class A372635 extends LambdaSequence {

  /** Construct the sequence. */
  public A372635() {
    super(1, n -> Integers.SINGLETON.sum(1, n, j -> Integers.SINGLETON.sum(1, n, k -> Functions.PHI.z(j).multiply(Functions.PHI.z(k)))));
  }
}
