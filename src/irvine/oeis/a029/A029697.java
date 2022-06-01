package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029697 Number of words of length 2n in the 6 transpositions of S[ 4 ] equivalent to the identity.
 * @author Sean A. Irvine
 */
public class A029697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029697() {
    super(new long[] {-144, 40}, new long[] {6, 120});
  }
}
