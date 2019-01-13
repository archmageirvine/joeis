package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059633.
 * @author Sean A. Irvine
 */
public class A059633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059633() {
    super(new long[] {1, -1, 0, 2}, new long[] {1, 2, 4, 7});
  }
}
