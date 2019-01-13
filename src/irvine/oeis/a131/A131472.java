package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131472.
 * @author Sean A. Irvine
 */
public class A131472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131472() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 2, 66, 732, 4100, 15630, 46662});
  }
}
