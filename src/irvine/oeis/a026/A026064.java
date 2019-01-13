package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026064.
 * @author Sean A. Irvine
 */
public class A026064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026064() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {35, 59, 90, 127, 172, 225, 287});
  }
}
