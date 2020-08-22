package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098646 Trace sequence of 3 X 3 Krawtchouk matrix.
 * @author Sean A. Irvine
 */
public class A098646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098646() {
    super(new long[] {4, 0}, new long[] {3, 2});
  }
}
