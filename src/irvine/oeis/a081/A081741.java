package irvine.oeis.a081;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a005.A005554;

/**
 * A081741 Numbers k that divide A005554(k) (the sum of consecutive Motzkin numbers).
 * @author Sean A. Irvine
 */
public class A081741 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081741() {
    super(1, 1, new A005554(), (n, k) -> k.mod(n) == 0);
  }
}
