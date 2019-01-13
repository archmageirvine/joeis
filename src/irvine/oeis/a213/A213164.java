package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213164.
 * @author Sean A. Irvine
 */
public class A213164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213164() {
    super(new long[] {9, -33, 46, -30, 9}, new long[] {1, 9, 51, 235, 966});
  }
}
