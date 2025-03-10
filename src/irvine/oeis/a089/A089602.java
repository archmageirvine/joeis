package irvine.oeis.a089;
// Generated by gen_seq4.pl 2025-02-16.ack/rootet at 2025-02-16 22:50

import irvine.oeis.a053.A053175;
import irvine.oeis.transform.RootSequence;

/**
 * A089602 Expansion of L(x)^(1/4), where L(x) = o.g.f. for A053175.
 * @author Georg Fischer
 */
public class A089602 extends RootSequence {

  /** Construct the sequence. */
  public A089602() {
    super(0, new A053175().skip(1), 1, 4);
  }
}
