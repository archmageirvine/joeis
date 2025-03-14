package irvine.oeis.a187;
// Generated by gen_seq4.pl 2025-02-16.ack/lambdan at 2025-02-16 22:50

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A187334 Sum{floor(kn/5), k=1,2,3,4,5}; complement of A187335.
 * @author Georg Fischer
 */
public class A187334 extends LambdaSequence {

  /** Construct the sequence. */
  public A187334() {
    super(0, n -> Integers.SINGLETON.sum(1, 5, k -> Z.valueOf(n).multiply(k).divide(5)));
  }
}
