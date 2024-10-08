package irvine.oeis.a118;
// Generated by gen_seq4.pl 2024-04-01/lambdan at 2024-04-01 22:42

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A118014 a(n) = Sum_{k=1..n} floor(n^2/k).
 * @author Georg Fischer
 */
public class A118014 extends LambdaSequence {

  /** Construct the sequence. */
  public A118014() {
    super(0, n -> Integers.SINGLETON.sum(1, n, k -> Z.valueOf((long) n * n).divide(k)));
  }
}
