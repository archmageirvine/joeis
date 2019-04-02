package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036258 Number of inequivalent strings of n digits, when 2 strings are equivalent if turning 1 upside down gives the other.
 * @author Sean A. Irvine
 */
public class A036258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036258() {
    super(new long[] {250, -75, -45, 15}, new long[] {1, 9, 90, 945});
  }
}
