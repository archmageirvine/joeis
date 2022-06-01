package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155656 9^n+7^n-1.
 * @author Sean A. Irvine
 */
public class A155656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155656() {
    super(new long[] {63, -79, 17}, new long[] {1, 15, 129});
  }
}
