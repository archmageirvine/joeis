package irvine.oeis.a019;

import irvine.oeis.RecordPositionSequence;

/**
 * A019276 Let sigma_m(n) be the result of applying the sum-of-divisors function m times to n; let m(n) = min m such that n divides sigma_m (n); let k(n) = sigma_{m(n)}(n)/n; sequence gives the megaperfect numbers n, where m(n) increases to a record.
 * @author Sean A. Irvine
 */
public class A019276 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A019276() {
    super(new A019294(), 1);
  }
}

