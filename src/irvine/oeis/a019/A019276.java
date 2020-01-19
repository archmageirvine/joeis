package irvine.oeis.a019;

import irvine.oeis.RecordPositionSequence;

/**
 * A019276 Megaperfect numbers: numbers n where <code>A019294(n) =</code> min <code>{m: n</code> divides <code>sigma^(m) (n)}</code> increases to a record; <code>sigma^(m)</code> means apply the <code>sum-of-divisors</code> function m times.
 * @author Sean A. Irvine
 */
public class A019276 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A019276() {
    super(new A019294(), 1);
  }
}

