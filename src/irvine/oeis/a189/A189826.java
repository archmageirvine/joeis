package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189826.
 * @author Sean A. Irvine
 */
public class A189826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189826() {
    super(new long[] {36, -168, 325, -337, 202, -70, 13}, new long[] {2, 7, 40, 199, 856, 3359, 12440});
  }
}
