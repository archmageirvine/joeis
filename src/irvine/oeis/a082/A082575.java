package irvine.oeis.a082;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001006;

/**
 * A082575 Nonnegative numbers in (3*A005836) union (3*A005836 - 2) [A005836 lists the numbers with base-3 representation containing no 2].
 * @author Sean A. Irvine
 */
public class A082575 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A082575() {
    super(1, 0, new A001006(), k -> k.mod(3) == 1);
  }
}
