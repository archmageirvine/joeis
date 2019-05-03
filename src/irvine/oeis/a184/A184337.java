package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184337 <code>a(n)</code> is the integer whose decimal representation consists of <code>n 8</code>'s followed by <code>n 1</code>'s.
 * @author Sean A. Irvine
 */
public class A184337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184337() {
    super(new long[] {1000, -1110, 111}, new long[] {0, 81, 8811});
  }
}
