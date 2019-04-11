package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130723 Lowest common multiple of 3 and <code>n^2+n+1</code>.
 * @author Sean A. Irvine
 */
public class A130723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130723() {
    super(new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {3, 3, 21, 39, 21, 93, 129, 57, 219});
  }
}
