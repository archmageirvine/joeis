package irvine.oeis.a077;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a062.A062273;

/**
 * A077579 Numbers k that divide A062273(k).
 * @author Sean A. Irvine
 */
public class A077579 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A077579() {
    super(1, 1, new A062273(), (n, v) -> v.mod(n) == 0);
  }
}
