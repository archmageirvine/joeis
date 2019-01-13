package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261933.
 * @author Sean A. Irvine
 */
public class A261933 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261933() {
    super(new long[] {1, -1, -70, 70, 1}, new long[] {40, 91, 2743, 6364, 192004});
  }
}
