package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169676 Lexicographically earliest de Bruijn sequence for <code>n = 2</code> and <code>k = 3</code>.
 * @author Sean A. Irvine
 */
public class A169676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169676() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 0, 1, 0, 2, 1, 1, 2, 2});
  }
}
