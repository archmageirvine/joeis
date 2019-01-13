package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275175.
 * @author Sean A. Irvine
 */
public class A275175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275175() {
    super(new long[] {1, 0, 0, 0, 0, -35, 0, 0, 0, 0, 35, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 3, 5, 7, 13, 23, 83, 147, 215, 423});
  }
}
