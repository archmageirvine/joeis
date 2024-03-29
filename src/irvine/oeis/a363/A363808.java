package irvine.oeis.a363;
// Generated by gen_seq4.pl 2023-09-20/lambda at 2023-09-21 01:53

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A363808 Number of divisors of n of the form 7*k + 6.
 * @author Georg Fischer
 */
public class A363808 extends LambdaSequence {

  /** Construct the sequence. */
  public A363808() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(d % 7 != 6 ? 0 : 1)));
  }
}
