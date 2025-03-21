package irvine.oeis.a143;
// Generated by gen_seq4.pl 2024-04-01/filnum at 2024-04-01 22:42

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A143202 Numbers having exactly two distinct prime factors p, q with q = p+2.
 * @author Georg Fischer
 */
public class A143202 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A143202() {
    super(1, 1, k -> {
      final Z[] pq = Jaguar.factor(k).toZArray();
      return pq.length == 2 && pq[0].add(2).equals(pq[1]);
    });
  }
}
