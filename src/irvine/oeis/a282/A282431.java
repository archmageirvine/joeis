package irvine.oeis.a282;
// Generated by gen_seq4.pl rootet at 2023-01-22 20:14

import irvine.oeis.a006.A006352;
import irvine.oeis.transform.RootSequence;

/**
 * A282431 Coefficients in q-expansion of E_2^5, where E_2 is the Eisenstein series A006352.
 * Coefficients in q-expansion of E_2^5,where E_2 is the Eisenstein series A006352.
 * @author Georg Fischer
 */
public class A282431 extends RootSequence {

  /** Construct the sequence. */
  public A282431() {
    super(0, new A006352().skip(1), 5, 1);
  }
}
