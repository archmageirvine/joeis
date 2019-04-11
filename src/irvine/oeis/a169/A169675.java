package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169675 Lexicographically earliest de Bruijn sequence for <code>n = 3</code> and k <code>= 2</code>.
 * @author Sean A. Irvine
 */
public class A169675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169675() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 0, 0, 1, 0, 1, 1, 1});
  }
}
