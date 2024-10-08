package irvine.oeis.a093;
// Generated by gen_seq4.pl 2024-09-11.ack/lambdan at 2024-09-11 23:28

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A093640 Number of divisors of n whose binary representation is contained in that of n.
 * @author Georg Fischer
 */
public class A093640 extends LambdaSequence {

  /** Construct the sequence. */
  public A093640() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Long.toString(n, 2).indexOf(Long.toString(d, 2)) >= 0 ? Z.ONE : Z.ZERO));
  }
}
