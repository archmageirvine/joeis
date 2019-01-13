package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081593.
 * @author Sean A. Irvine
 */
public class A081593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081593() {
    super(new long[] {1, -3, 3}, new long[] {1, 17, 97});
  }
}
