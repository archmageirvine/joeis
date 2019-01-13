package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230018.
 * @author Sean A. Irvine
 */
public class A230018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230018() {
    super(new long[] {-1, 4, -6, 4}, new long[] {7, 41, 129, 298});
  }
}
