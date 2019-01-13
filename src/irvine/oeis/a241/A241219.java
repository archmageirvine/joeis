package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241219.
 * @author Sean A. Irvine
 */
public class A241219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241219() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 21, 171, 666, 1830});
  }
}
