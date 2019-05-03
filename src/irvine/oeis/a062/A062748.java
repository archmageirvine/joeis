package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062748 Fourth column <code>(r=3)</code> of <code>FS(3)</code> staircase array <code>A062745</code>.
 * @author Sean A. Irvine
 */
public class A062748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062748() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 9, 19, 34});
  }
}
