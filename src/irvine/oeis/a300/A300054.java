package irvine.oeis.a300;
// Generated by gen_seq4.pl rootet at 2023-02-18 22:29

import irvine.oeis.a289.A289210;
import irvine.oeis.transform.RootSequence;

/**
 * A300054 Coefficients in expansion of (E_4^3/E_6^2)^(1/3).
 * (k=96)
 * @author Georg Fischer
 */
public class A300054 extends RootSequence {

  /** Construct the sequence. */
  public A300054() {
    super(0, new A289210().skip(1), -96, 288);
  }
}
