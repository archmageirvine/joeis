package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128782 <code>n^2*4^n</code>.
 * @author Sean A. Irvine
 */
public class A128782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128782() {
    super(new long[] {64, -48, 12}, new long[] {0, 4, 64});
  }
}
