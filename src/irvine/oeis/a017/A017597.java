package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017597.
 * @author Sean A. Irvine
 */
public class A017597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017597() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {7776, 1889568, 24300000, 130691232, 459165024, 1252332576});
  }
}
