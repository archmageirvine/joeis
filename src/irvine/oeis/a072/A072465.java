package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072465.
 * @author Sean A. Irvine
 */
public class A072465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072465() {
    super(new long[] {1, 1, 1, 1, 0}, new long[] {1, 1, 1, 2, 3});
  }
}
