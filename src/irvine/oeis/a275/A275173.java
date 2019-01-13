package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275173.
 * @author Sean A. Irvine
 */
public class A275173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275173() {
    super(new long[] {1, 0, 0, 0, 0, -16, 0, 0, 0, 0, 16, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 2, 3, 4, 6, 9, 22, 36, 51, 82});
  }
}
