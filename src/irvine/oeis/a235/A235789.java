package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235789.
 * @author Sean A. Irvine
 */
public class A235789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235789() {
    super(new long[] {8, 0, 4, 0, -2, 0}, new long[] {0, 1, -2, 0, 0, 8});
  }
}
