package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156039.
 * @author Sean A. Irvine
 */
public class A156039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156039() {
    super(new long[] {-1, 2, -1, 1, -1, -1, 1, -1, 2}, new long[] {1, 1, 4, 7, 11, 17, 26, 35, 48});
  }
}
