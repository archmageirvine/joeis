package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242762.
 * @author Sean A. Irvine
 */
public class A242762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242762() {
    super(new long[] {1, -2, 0, 1, 1}, new long[] {2, 3, 4, 8, 10});
  }
}
