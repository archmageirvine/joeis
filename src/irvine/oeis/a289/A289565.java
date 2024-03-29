package irvine.oeis.a289;
// Generated by gen_seq4.pl rootet at 2023-01-22 20:14

import irvine.oeis.a006.A006352;
import irvine.oeis.transform.RootSequence;

/**
 * A289565 Coefficients in expansion of 1/E_2^(1/2).
 * Coefficients in expansion of E_2^(-1/2).
 * @author Georg Fischer
 */
public class A289565 extends RootSequence {

  /** Construct the sequence. */
  public A289565() {
    super(0, new A006352().skip(1), -1, 2);
  }
}
