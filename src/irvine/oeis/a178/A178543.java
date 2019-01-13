package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178543.
 * @author Sean A. Irvine
 */
public class A178543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178543() {
    super(new long[] {3, -1, 3}, new long[] {0, 1, 3});
  }
}
