package irvine.oeis.a290;
// Generated by gen_seq4.pl 2024-07-27.ack/lambdan at 2024-07-27 22:17

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a010.A010051;

/**
 * A290288 Sum of the differences of the larger and smaller parts in the partitions of 2n into two parts with the larger part prime.
 * @author Georg Fischer
 */
public class A290288 extends LambdaSequence {

  private static final DirectSequence A010051 = new A010051();

  /** Construct the sequence. */
  public A290288() {
    super(1, n -> Z.TWO.multiply(Integers.SINGLETON.sum(1, n, i -> Z.valueOf(n - i).multiply(A010051.a(2 * n - i)))));
  }
}
