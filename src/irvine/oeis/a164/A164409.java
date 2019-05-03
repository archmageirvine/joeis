package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164409 Number of binary strings of length n with no substrings equal to <code>0000 0001</code> or 0100.
 * @author Sean A. Irvine
 */
public class A164409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164409() {
    super(new long[] {1, -1, 2}, new long[] {13, 22, 39});
  }
}
