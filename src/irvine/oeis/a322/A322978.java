package irvine.oeis.a322;
// Generated by gen_seq4.pl 2025-03-16.ack/lambdan at 2025-03-16 17:02

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A322978 Number of even divisors d of 2n such that d-1 is prime.
 * @author Georg Fischer
 */
public class A322978 extends LambdaSequence {

  /** Construct the sequence. */
  public A322978() {
    super(1, n -> Integers.SINGLETON.countdiv(2 * n, d -> d > 1 && ((d & 1) == 0) && Z.valueOf(d - 1).isProbablePrime()));
  }
}
