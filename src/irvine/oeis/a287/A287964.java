package irvine.oeis.a287;
// Generated by gen_seq4.pl rootet at 2023-01-22 20:14

import irvine.oeis.a058.A058550;
import irvine.oeis.transform.RootSequence;

/**
 * A287964 Coefficients in expansion of 1/E_14.
 * Coefficients in expansion of 1/E_14.
 * @author Georg Fischer
 */
public class A287964 extends RootSequence {

  /** Construct the sequence. */
  public A287964() {
    super(0, new A058550().skip(1), -1, 1);
  }
}
