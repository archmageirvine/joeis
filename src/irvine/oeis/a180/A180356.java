package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180356 n^6+6n.
 * @author Sean A. Irvine
 */
public class A180356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180356() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 7, 76, 747, 4120, 15655, 46692});
  }
}
