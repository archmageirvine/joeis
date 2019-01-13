package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161905.
 * @author Sean A. Irvine
 */
public class A161905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161905() {
    super(new long[] {-13, 91, -182, 156, -65, 13}, new long[] {2, 4, 13, 52, 221, 949});
  }
}
