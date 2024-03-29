package irvine.oeis.a289;
// Generated by gen_seq4.pl rootet at 2023-01-22 20:14

import irvine.oeis.a004.A004009;
import irvine.oeis.transform.RootSequence;

/**
 * A289566 Coefficients in expansion of 1/E_4^(1/2).
 * Coefficients in expansion of E_4^(-1/2).
 * @author Georg Fischer
 */
public class A289566 extends RootSequence {

  /** Construct the sequence. */
  public A289566() {
    super(0, new A004009().skip(1), -1, 2);
  }
}
