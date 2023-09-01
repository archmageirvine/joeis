package irvine.oeis.a065;

import irvine.oeis.RecordSequence;

/**
 * A065394 Increasing values of A065395: a(n) = A065395(A065393(n)).
 * @author Sean A. Irvine
 */
public class A065394 extends RecordSequence {

  /** Construct the sequence. */
  public A065394() {
    super(new A065395(), false);
    next();
  }
}
