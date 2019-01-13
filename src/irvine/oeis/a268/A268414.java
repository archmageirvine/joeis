package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268414.
 * @author Sean A. Irvine
 */
public class A268414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268414() {
    super(new long[] {5, -11, 7}, new long[] {1, 3, 11});
  }
}
