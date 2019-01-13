package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027850.
 * @author Sean A. Irvine
 */
public class A027850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027850() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 68, 531, 2056, 5645});
  }
}
