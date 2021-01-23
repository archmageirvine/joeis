package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080679 Lexicographically earliest de Bruijn cycle of length 16 (repeated indefinitely).
 * @author Sean A. Irvine
 */
public class A080679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080679() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1});
  }
}
