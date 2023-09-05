package irvine.oeis.a203;
// manually quots at 2021-11-26 22:57

import irvine.oeis.SelfQuotientSequence;

/**
 * A203308 a(n) = A203306(n+1)/A203306(n).
 * @author Georg Fischer
 */
public class A203308 extends SelfQuotientSequence {

  /** Construct the sequence. */
  public A203308() {
    super(0, new A203306(), 1);
    super.next();
  }
}
