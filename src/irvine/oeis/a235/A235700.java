package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235700.
 * @author Sean A. Irvine
 */
public class A235700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235700() {
    super(new long[] {-1, 2, -2, 2}, new long[] {1, 2, 4, 8});
  }
}
