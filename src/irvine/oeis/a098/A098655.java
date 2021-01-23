package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098655 Trace sequence of 3 X 3 symmetric Krawtchouk matrix.
 * @author Sean A. Irvine
 */
public class A098655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098655() {
    super(new long[] {-16, 8, 2}, new long[] {3, 2, 20});
  }
}
