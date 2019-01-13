package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247850.
 * @author Sean A. Irvine
 */
public class A247850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247850() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, -8, -16, 3816, 23008, 80600});
  }
}
