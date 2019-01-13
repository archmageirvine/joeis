package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275970.
 * @author Sean A. Irvine
 */
public class A275970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275970() {
    super(new long[] {2, -5, 4}, new long[] {2, 6, 13});
  }
}
