package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106521 Numbers m such that Sum_{k=0..10} (m+k)^2 is a square.
 * @author Sean A. Irvine
 */
public class A106521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106521() {
    super(new long[] {1, -1, -20, 20, 1}, new long[] {18, 38, 456, 854, 9192});
  }
}
