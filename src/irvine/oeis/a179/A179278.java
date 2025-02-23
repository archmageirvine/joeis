package irvine.oeis.a179;
// Generated by gen_seq4.pl 2024-07-24.ack/sintrif at 2024-07-24 22:30

import irvine.oeis.a014.A014684;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A179278 Largest nonprime integer &lt;= n.
 * @author Georg Fischer
 */
public class A179278 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A179278() {
    super(1, (term, n) -> term, "1, 1, 1, 4", new A014684());
  }
}
