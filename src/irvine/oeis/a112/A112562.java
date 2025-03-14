package irvine.oeis.a112;
// Generated by gen_seq4.pl 2025-02-03.ack/sintrif at 2025-02-03 18:14

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a073.A073362;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A112562 Sieve performed by successive iterations of steps where step m is: keep m terms, remove the next 4 and repeat; as m = 1,2,3,.. the remaining terms form this sequence.
 * @author Georg Fischer
 */
public class A112562 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A112562() {
    super(0, (term, n) -> Z.ONE.add(Z.FIVE.multiply(term)), "", new PrependSequence(0, new A073362(), 0));
  }
}
