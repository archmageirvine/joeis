package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274817.
 * @author Sean A. Irvine
 */
public class A274817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274817() {
    super(new long[] {2, -1, 0, 2}, new long[] {1, -1, 4, 8});
  }
}
