package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117616.
 * @author Sean A. Irvine
 */
public class A117616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117616() {
    super(new long[] {-4, 1, 4}, new long[] {0, 2, 8});
  }
}
