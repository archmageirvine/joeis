package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029699 Number of words of length 4 in the <code>n(n-1)/2</code> transpositions of <code>S[ n ]</code> equivalent to the identity.
 * @author Sean A. Irvine
 */
public class A029699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029699() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 27, 120, 340});
  }
}
