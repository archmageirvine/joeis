package irvine.oeis.a077;
// Generated by gen_seq4.pl 2024-09-21.ack/sintrif at 2024-09-21 22:07

import irvine.math.function.Functions;
import irvine.oeis.PrependSequence;
import irvine.oeis.a069.A069830;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A077005 Smallest k such that prime(n) divides k*prime(n-1) + 1, n &gt; 1.
 * @author Georg Fischer
 */
public class A077005 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A077005() {
    super(2, (term, n) -> Functions.PRIME.z(n).subtract(term), "", new PrependSequence(1, new A069830(), 1));
  }
}
