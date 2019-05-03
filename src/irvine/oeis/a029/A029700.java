package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029700 Number of words of length 6 in the <code>n(n-1)/2</code> transpositions of <code>S[ n ]</code> equivalent to the identity.
 * @author Sean A. Irvine
 */
public class A029700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029700() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 243, 3936, 20860, 72315, 197421});
  }
}
