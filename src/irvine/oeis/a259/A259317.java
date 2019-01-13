package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259317.
 * @author Sean A. Irvine
 */
public class A259317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259317() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 2, 70, 588, 2772, 9438, 26026});
  }
}
