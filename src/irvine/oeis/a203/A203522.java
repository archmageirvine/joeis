package irvine.oeis.a203;

import irvine.oeis.SelfQuotientSequence;

/**
 * A203522 a(n) = v(n+1)/v(n), where v = A203521.
 * @author Georg Fischer
 */
public class A203522 extends SelfQuotientSequence {

  /** Construct the sequence. */
  public A203522() {
    super(new A203521(), 1);
  }
}
