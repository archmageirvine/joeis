package irvine.oeis.a289;

import irvine.oeis.transform.RootSequence;

/**
 * A289340 Coefficients of (q*(j(q)-1728))^(1/3) where j(q) is the elliptic modular invariant.
 * @author Georg Fischer
 */
public class A289340 extends RootSequence {

  /** Construct the sequence. */
  public A289340() {
    super(0, new A289063().skip(1), 1, 3);
  }
}
