package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060484 Number of 6-block tricoverings of an <code>n-set</code>.
 * @author Sean A. Irvine
 */
public class A060484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060484() {
    super(new long[] {-12800, 25920, -17664, 5220, -720, 45}, new long[] {1, 95, 3107, 75835, 1653771, 34384875});
  }
}
