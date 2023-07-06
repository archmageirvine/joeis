package irvine.oeis.a289;
// manually 2023-02-18

import irvine.oeis.transform.RootSequence;

/**
 * A289365 Coefficients in expansion of (E_4^3/E_6^2)^(1/288).
 * (k=1),
 * @author Georg Fischer
 */
public class A289365 extends RootSequence {

  /** Construct the sequence. */
  public A289365() {
    super(0, new A289210().skip(1), -1, 288);
  }
}
