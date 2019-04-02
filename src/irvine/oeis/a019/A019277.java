package irvine.oeis.a019;

import irvine.oeis.RecordSequence;

/**
 * A019277 Let sigma_m(n) be the result of applying the sum-of-divisors function m times to n; let m(n) = min m such that n divides sigma_m (n); let k(n) = sigma_{m(n)}(n)/n; sequence gives k(n) for the megaperfect numbers n, where m(n) increases.
 * @author Sean A. Irvine
 */
public class A019277 extends RecordSequence {

  /** Construct the sequence. */
  public A019277() {
    super(new A019294());
  }
}

