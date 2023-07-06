package irvine.oeis.a289;

import irvine.oeis.transform.RootSequence;

/**
 * A289339 Coefficients of (q*(j(q)-1728))^(7/24) where j(q) is the elliptic modular invariant.
 * @author Georg Fischer
 */
public class A289339 extends RootSequence {

  /** Construct the sequence. */
  public A289339() {
    super(0, new A289063().skip(1), 7, 24);
  }
}
