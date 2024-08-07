package irvine.oeis.a265;
// Generated by gen_seq4.pl 2024-07-27.ack/lambdan at 2024-07-27 22:17

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;

/**
 * A265341 Permutation of odd numbers: a(n) = 1 + (2*A265353(n)).
 * @author Georg Fischer
 */
public class A265341 extends LambdaSequence {

  private static final DirectSequence A265353 = new A265353();

  /** Construct the sequence. */
  public A265341() {
    super(0, n -> Z.ONE.add(Z.TWO.multiply(A265353.a(n))));
  }
}
