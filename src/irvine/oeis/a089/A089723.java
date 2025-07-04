package irvine.oeis.a089;
// Generated by gen_seq4.pl 2025-06-16.ack/sintrif at 2025-06-16 21:55

import irvine.math.z.Z;
import irvine.oeis.a259.A259362;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A089723 a(1)=1; for n&gt;1, a(n) gives number of ways to write n as n = x^y, 2 &lt;= x, 1 &lt;= y.
 * @author Georg Fischer
 */
public class A089723 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A089723() {
    super(1, (term, n) -> Z.ONE.add(term), "1,1", new A259362());
  }
}
