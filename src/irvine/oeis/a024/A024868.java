package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024868.
 * @author Sean A. Irvine
 */
public class A024868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024868() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {6, 8, 22, 27, 52, 61, 100});
  }
}
