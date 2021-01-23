package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075676 Sequences A001644 and A000073 interleaved.
 * @author Sean A. Irvine
 */
public class A075676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075676() {
    super(new long[] {1, 0, 1, 0, 3, 0}, new long[] {3, 1, 3, 2, 11, 7});
  }
}
