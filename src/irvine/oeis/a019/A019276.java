package irvine.oeis.a019;

import irvine.oeis.RecordPositionSequence;

/**
 * A019276 Let <code>sigma_m(n)</code> be the result of applying the <code>sum-of-divisors</code> function m times to n; let <code>m(n) =</code> min m such that n divides <code>sigma_m (n)</code>; let <code>k(n) = sigma_{m(n)}(n)/n</code>; sequence gives the megaperfect numbers n, where <code>m(n)</code> increases to a record.
 * @author Sean A. Irvine
 */
public class A019276 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A019276() {
    super(new A019294(), 1);
  }
}

