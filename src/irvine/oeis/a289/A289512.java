package irvine.oeis.a289;
// Generated by gen_seq4.pl rootet at 2023-01-22 20:14

import irvine.oeis.a000.A000521;
import irvine.oeis.transform.RootSequence;

/**
 * A289512 Expansion of 1/j^5 where j is the elliptic modular invariant (A000521).
 * Expansion of 1/j^5 where j is the elliptic modular invariant (A000521).
 * @author Georg Fischer
 */
public class A289512 extends RootSequence {

  /** Construct the sequence. */
  public A289512() {
    super(5, new A000521().skip(1), -5, 1);
  }
}
