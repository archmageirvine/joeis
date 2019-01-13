package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123865.
 * @author Sean A. Irvine
 */
public class A123865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123865() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 15, 80, 255, 624});
  }
}
