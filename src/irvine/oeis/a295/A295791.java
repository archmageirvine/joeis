package irvine.oeis.a295;
// Generated by gen_seq4.pl rootet at 2023-01-22 20:14

import irvine.oeis.a006.A006352;
import irvine.oeis.transform.RootSequence;

/**
 * A295791 Coefficients in expansion of E_2^(-1/4).
 * Coefficients in expansion of E_2^(-1/4).
 * @author Georg Fischer
 */
public class A295791 extends RootSequence {

  /** Construct the sequence. */
  public A295791() {
    super(0, new A006352().skip(1), -1, 4);
  }
}
