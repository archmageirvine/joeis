package irvine.oeis.a072;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000045;

/**
 * A072381 Numbers m such that Fibonacci(m) is a semiprime.
 * @author Sean A. Irvine
 */
public class A072381 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A072381() {
    super(1, 0, new A000045(), SEMIPRIME);
  }
}
