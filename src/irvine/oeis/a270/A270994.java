package irvine.oeis.a270;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A270994 a(n) = 9454129 + 11184810*n.
 * @author Sean A. Irvine
 */
public class A270994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270994() {
    super(new long[] {-1, 2}, new long[] {9454129, 20638939});
  }
}
