package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079273.
 * @author Sean A. Irvine
 */
public class A079273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079273() {
    super(new long[] {1, -3, 3}, new long[] {1, 10, 29});
  }
}
