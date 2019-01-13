package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079034.
 * @author Sean A. Irvine
 */
public class A079034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079034() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 2, 7, 21, 51});
  }
}
