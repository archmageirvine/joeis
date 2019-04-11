package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062547 <code>a(n)</code> is least odd integer not a partial sum of <code>1, 3, </code>..., <code>a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A062547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062547() {
    super(new long[] {3, 3, -1}, new long[] {1, 3, 5});
  }
}
