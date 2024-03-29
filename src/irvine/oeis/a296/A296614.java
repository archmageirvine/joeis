package irvine.oeis.a296;
// Generated by gen_seq4.pl rootet at 2023-01-22 20:14

import irvine.oeis.a289.A289210;
import irvine.oeis.transform.RootSequence;

/**
 * A296614 Coefficients in expansion of (E_6^2/E_4^3)^(1/96).
 * (k=3),
 * @author Georg Fischer
 */
public class A296614 extends RootSequence {

  /** Construct the sequence. */
  public A296614() {
    super(0, new A289210().skip(1), 3, 288);
  }
}
