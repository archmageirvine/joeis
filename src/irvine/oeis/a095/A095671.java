package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095671 Ninth column (m=8) of (1,4)-Pascal triangle A095666.
 * @author Sean A. Irvine
 */
public class A095671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095671() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {4, 33, 153, 525, 1485, 3663, 8151, 16731, 32175});
  }
}
