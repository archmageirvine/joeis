package irvine.oeis.a338;
// Generated by gen_seq4.pl 2023-09-20/lambda at 2023-09-21 01:53

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A338234 Sum of the numbers less than n whose square does not divide n.
 * @author Georg Fischer
 */
public class A338234 extends LambdaSequence {

  /** Construct the sequence. */
  public A338234() {
    super(1, n -> Integers.SINGLETON.sum(1, n - 1, k -> Z.valueOf(n % (k * k) != 0 ? k : 0)));
  }
}
