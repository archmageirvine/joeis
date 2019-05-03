package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164414 Number of binary strings of length n with no substrings equal to <code>0000 0001</code> or 1010.
 * @author Sean A. Irvine
 */
public class A164414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164414() {
    super(new long[] {2, 0, 1}, new long[] {13, 22, 37});
  }
}
