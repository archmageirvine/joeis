package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184327.
 * @author Sean A. Irvine
 */
public class A184327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184327() {
    super(new long[] {1, -6, 0, 6}, new long[] {1, 17, 97, 577});
  }
}
