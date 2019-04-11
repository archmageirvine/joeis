package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191467 <code>9^n - 7^n</code>.
 * @author Sean A. Irvine
 */
public class A191467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191467() {
    super(new long[] {-63, 16}, new long[] {0, 2});
  }
}
