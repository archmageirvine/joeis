package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109344 <code>a(n)</code> consists of <code>n 4's, n-1 8</code>'s and a single <code>9</code> (in that order).
 * @author Sean A. Irvine
 */
public class A109344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109344() {
    super(new long[] {1000, -1110, 111}, new long[] {49, 4489, 444889});
  }
}
