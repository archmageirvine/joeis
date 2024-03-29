package irvine.oeis.a289;
// Generated by gen_seq4.pl rootet at 2023-01-22 20:14

import irvine.oeis.a058.A058550;
import irvine.oeis.transform.RootSequence;

/**
 * A289391 Coefficients in expansion of E_14^(1/4).
 * Coefficients in expansion of E_14^(1/4).
 * @author Georg Fischer
 */
public class A289391 extends RootSequence {

  /** Construct the sequence. */
  public A289391() {
    super(0, new A058550().skip(1), 1, 4);
  }
}
