package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251602.
 * @author Sean A. Irvine
 */
public class A251602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251602() {
    super(new long[] {1, -35, 35}, new long[] {1, 19, 637});
  }
}
