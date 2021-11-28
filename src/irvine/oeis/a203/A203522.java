package irvine.oeis.a203;
// manually quots at 2021-11-26 23:42

import irvine.oeis.SelfQuotientSequence;

/**
 * A203522 v(n+1)/v(n), where v=A203521.
 * @author Georg Fischer
 */
public class A203522 extends SelfQuotientSequence {

  /** Construct the sequence. */
  public A203522() {
    super(new A203521(), 1);
    next();
  }
}
