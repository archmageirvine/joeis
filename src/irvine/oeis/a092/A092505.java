package irvine.oeis.a092;
// manually quots/quot at 2021-11-26 22:57

import irvine.oeis.QuotientSequence;
import irvine.oeis.a002.A002430;
import irvine.oeis.a046.A046990;

/**
 * A092505 a(n) = A002430(n) / A046990(n).
 * @author Georg Fischer
 */
public class A092505 extends QuotientSequence {

  /** Construct the sequence. */
  public A092505() {
    super(new A002430(), new A046990(), 0, 1);
  }
}
