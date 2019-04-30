package irvine.oeis.a019;

import irvine.oeis.RecordSequence;

/**
 * A019277 Let sigma_m(n) be the result of applying the sum-of-divisors function m times to n; let <code>m(n) =</code> min m such that n divides sigma_m <code>(n)</code>; let <code>k(n) =</code> sigma_{m(n)}(n)/n; sequence gives <code>k(n)</code> for the megaperfect numbers n, where <code>m(n)</code> increases.
 * @author Sean A. Irvine
 */
public class A019277 extends RecordSequence {

  /** Construct the sequence. */
  public A019277() {
    super(new A019294());
  }
}

