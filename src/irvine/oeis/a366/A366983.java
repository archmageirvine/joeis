package irvine.oeis.a366;
// Generated by gen_seq4.pl 2024-01-23/lambdan at 2024-01-25 00:21

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A366983 a(n) = Sum_{k=1..n} (k+1) * floor(n/k).
 * @author Georg Fischer
 */
public class A366983 extends LambdaSequence {

  /** Construct the sequence. */
  public A366983() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Z.valueOf(k + 1).multiply(n / k)));
  }
}
