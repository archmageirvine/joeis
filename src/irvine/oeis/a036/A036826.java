package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036826 <code>A036800/2</code>.
 * @author Sean A. Irvine
 */
public class A036826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036826() {
    super(new long[] {-8, 20, -18, 7}, new long[] {0, 1, 9, 45});
  }
}
