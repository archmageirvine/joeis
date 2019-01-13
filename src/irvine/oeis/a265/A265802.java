package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265802.
 * @author Sean A. Irvine
 */
public class A265802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265802() {
    super(new long[] {-1, 2, 2}, new long[] {1, 11, 19});
  }
}
