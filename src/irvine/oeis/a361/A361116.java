package irvine.oeis.a361;
// Generated by gen_seq4.pl 2025-02-20.ack/sintrif at 2025-02-20 23:05

import irvine.math.z.Z;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A361116 a(n)=0 if A361102(n) is divisible by 3, otherwise 1.
 * @author Georg Fischer
 */
public class A361116 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A361116() {
    super(0, (term, n) -> Z.valueOf(term.mod(3) == 0 ? 0 : 1), "", new A361102());
  }
}
