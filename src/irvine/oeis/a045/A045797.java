package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045797 Evenish numbers (prime to 10 and 10's digit is even).
 * @author Sean A. Irvine
 */
public class A045797 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A045797() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 3, 7, 9, 21});
  }
}
