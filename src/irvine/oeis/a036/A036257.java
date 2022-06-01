package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036257 Number of inequivalent strings of 2n digits, when 2 strings are equivalent if turning 1 upside down gives the other.
 * @author Sean A. Irvine
 */
public class A036257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036257() {
    super(new long[] {12500, -3125, 130}, new long[] {1, 90, 9700});
  }
}
