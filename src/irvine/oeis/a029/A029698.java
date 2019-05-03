package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029698 Number of words of length <code>2n</code> in the 10 transpositions of <code>S[5]</code> equivalent to the identity.
 * @author Sean A. Irvine
 */
public class A029698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029698() {
    super(new long[] {10000, -3000, 129}, new long[] {10, 340, 20860});
  }
}
