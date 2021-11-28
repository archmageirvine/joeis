package irvine.oeis.a092;
// manually quots/quot at 2021-11-26 22:57

import irvine.oeis.QuotientSequence;
import irvine.oeis.a001.A001142;
import irvine.oeis.a002.A002944;

/**
 * A092592 a(n) = A001142(n)/A002944(n), i.e., the product of C(n,j) binomial coefficients (for j=0..n) is divided by the least common multiple of them.
 * @author Georg Fischer
 */
public class A092592 extends QuotientSequence {

  /** Construct the sequence. */
  public A092592() {
    super(new A001142(), new A002944());
    next();
  }
}
