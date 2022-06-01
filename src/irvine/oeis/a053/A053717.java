package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053717 a(n) = n^7 + n^6 + n^5 + n^4 + n^3 + n^2 + n + 1.
 * @author Sean A. Irvine
 */
public class A053717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053717() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 8, 255, 3280, 21845, 97656, 335923, 960800});
  }
}
