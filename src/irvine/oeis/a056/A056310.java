package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056310.
 * @author Sean A. Irvine
 */
public class A056310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056310() {
    super(new long[] {36, -66, 6, 49, -24, -6, 6}, new long[] {0, 0, 3, 18, 78, 273, 921});
  }
}
