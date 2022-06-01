package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029698 Number of words of length 2n in the 10 transpositions of S[5] equivalent to the identity.
 * @author Sean A. Irvine
 */
public class A029698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029698() {
    super(new long[] {10000, -3000, 129}, new long[] {10, 340, 20860});
  }
}
