package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037562.
 * @author Sean A. Irvine
 */
public class A037562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037562() {
    super(new long[] {-5, 1, 0, 5}, new long[] {2, 12, 61, 307});
  }
}
