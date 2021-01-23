package irvine.oeis.a019;

import irvine.oeis.RecordPositionSequence;

/**
 * A019276 Megaperfect numbers: numbers n where A019294(n) = min {m: n divides sigma^(m) (n)} increases to a record; sigma^(m) means apply the sum-of-divisors function m times.
 * @author Sean A. Irvine
 */
public class A019276 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A019276() {
    super(new A019294(), 1);
  }
}

