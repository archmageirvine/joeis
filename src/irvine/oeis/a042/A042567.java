package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042567.
 * @author Sean A. Irvine
 */
public class A042567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042567() {
    super(new long[] {-1, 0, 114, 0}, new long[] {1, 2, 113, 228});
  }
}
