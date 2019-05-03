package irvine.oeis.a019;

import irvine.oeis.RecordSequence;

/**
 * A019277 Let <code>sigma_m(n)</code> be the result of applying the <code>sum-of-divisors</code> function m times to n; let <code>m(n) =</code> min m such that n divides <code>sigma_m (n)</code>; let <code>k(n) = sigma_{m(n)}(n)/n</code>; sequence gives <code>k(n)</code> for the megaperfect numbers n, where <code>m(n)</code> increases.
 * @author Sean A. Irvine
 */
public class A019277 extends RecordSequence {

  /** Construct the sequence. */
  public A019277() {
    super(new A019294());
  }
}

