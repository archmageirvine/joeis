package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102302 Largest number <code>&lt; n/2</code> coprime to n.
 * @author Sean A. Irvine
 */
public class A102302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102302() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {3, 3, 4, 3, 5});
  }
}
