package irvine.oeis.a140;
// Generated by gen_seq4.pl 2024-11-21.ack/lambdan at 2024-11-21 23:03

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A140048 a(n) = (1/2)*Sum_{j=0..2^n-1} j^(n-1) for n&gt;=1.
 * @author Georg Fischer
 */
public class A140048 extends LambdaSequence {

  /** Construct the sequence. */
  public A140048() {
    super(1, n -> Integers.SINGLETON.sum(0, (1 << n) - 1, j -> Z.valueOf(j).pow(n - 1)).divide(2));
  }
}
