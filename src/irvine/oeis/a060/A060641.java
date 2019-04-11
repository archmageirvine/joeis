package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060641 Surround numbers of a length <code>2n</code> zig-zag.
 * @author Sean A. Irvine
 */
public class A060641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060641() {
    super(new long[] {1, -3, 3}, new long[] {161, 257, 373});
  }
}
