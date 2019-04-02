package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069515 Number of transpositions (interchanges of adjacent digits, sometimes called inversions) needed to change all n-digit base 3 numbers into nondecreasing order.
 * @author Sean A. Irvine
 */
public class A069515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069515() {
    super(new long[] {27, -27, 9}, new long[] {0, 3, 24});
  }
}
