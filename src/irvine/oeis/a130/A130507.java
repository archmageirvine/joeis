package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130507 First differences of <code>A130845</code>.
 * @author Sean A. Irvine
 */
public class A130507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130507() {
    super(new long[] {1, 1, 1, 1, -1, -1, -1}, new long[] {0, 0, 1, 0, 0, 0, 2});
  }
}
