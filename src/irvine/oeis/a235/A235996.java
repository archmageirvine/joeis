package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235996.
 * @author Sean A. Irvine
 */
public class A235996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235996() {
    super(new long[] {2, 3, -4, -3, 4}, new long[] {0, 0, 0, 0, 1});
  }
}
