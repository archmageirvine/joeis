package irvine.oeis.a338;
// Generated by gen_seq4.pl 2024-07-26/lambdin at 2024-07-27 00:11

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A338470 Number of integer partitions of n with no part dividing all the others.
 * @author Georg Fischer
 */
public class A338470 extends LambdaSequence {

  /** Construct the sequence. */
  public A338470() {
    super(0, n -> Functions.PARTITIONS.z(n).subtract(Integers.SINGLETON.sumdiv(n, d -> Functions.PARTITIONS.z(d - 1))), "1");
  }
}
