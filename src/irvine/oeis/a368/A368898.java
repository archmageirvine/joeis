package irvine.oeis.a368;
// Generated by gen_seq4.pl 2024-01-23/lambdan at 2024-01-25 00:21

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A368898 a(n) = Sum_{k=0..floor(n/4)} n^k * binomial(n-3*k,k).
 * @author Georg Fischer
 */
public class A368898 extends LambdaSequence {

  /** Construct the sequence. */
  public A368898() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 4, k -> Z.valueOf(n).pow(k).multiply(Binomial.binomial(n - 3L * k, k))));
  }
}
