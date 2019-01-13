package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092365.
 * @author Sean A. Irvine
 */
public class A092365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092365() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 8, 36, 112, 275});
  }
}
