package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129345 a(2n) = A001542(n+1), a(2n+1) = A038761(n+1); a Pellian-related sequence.
 * @author Sean A. Irvine
 */
public class A129345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129345() {
    super(new long[] {-1, 0, 6, 0}, new long[] {2, 9, 12, 53});
  }
}
