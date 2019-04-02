package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129346 a(2n) = A100525(n), a(2n+1) = A001653(n+1); a Pellian-related sequence.
 * @author Sean A. Irvine
 */
public class A129346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129346() {
    super(new long[] {-1, 0, 6, 0}, new long[] {4, 5, 22, 29});
  }
}
