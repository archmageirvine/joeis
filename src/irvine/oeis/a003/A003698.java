package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003698.
 * @author Sean A. Irvine
 */
public class A003698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003698() {
    super(new long[] {-4, 3, 6}, new long[] {1, 9, 53});
  }
}
