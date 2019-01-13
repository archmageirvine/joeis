package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122011.
 * @author Sean A. Irvine
 */
public class A122011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122011() {
    super(new long[] {2, -15, 12}, new long[] {0, 1, 13});
  }
}
