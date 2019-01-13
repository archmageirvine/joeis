package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059999.
 * @author Sean A. Irvine
 */
public class A059999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059999() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {2, 3, 5, 7, 11, 42});
  }
}
