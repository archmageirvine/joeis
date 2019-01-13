package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090949.
 * @author Sean A. Irvine
 */
public class A090949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090949() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 27, 89, 203, 389});
  }
}
