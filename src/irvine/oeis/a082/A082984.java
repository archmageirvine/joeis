package irvine.oeis.a082;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a006.A006577;

/**
 * A082984 Numbers k for which the 3x+1 problem takes at least k halving and tripling steps to reach 1.
 * @author Sean A. Irvine
 */
public class A082984 extends PrependSequence {

  /** Construct the sequence. */
  public A082984() {
    super(1, new FilterPositionSequence(1, 1, new A006577(), (n, k) -> k.compareTo(n) >= 0), 1, 2);
  }
}
