package irvine.oeis.a394;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a022.A022307;

/**
 * A394771 Numbers k such that Fibonacci(k) has a record number of distinct prime factors.
 * @author Sean A. Irvine
 */
public class A394771 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A394771() {
    super(1, 0, new A022307());
  }
}
