package irvine.oeis.a070;

import irvine.oeis.FilterPositionSequence;

/**
 * A070873 A070871(n) &gt; n.
 * @author Sean A. Irvine
 */
public class A070873 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A070873() {
    super(1, 1, new A070871(), (n, k) -> k.compareTo(n) > 0);
  }
}
