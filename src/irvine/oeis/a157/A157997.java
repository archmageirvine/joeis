package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157997 <code>288n - 1</code>.
 * @author Sean A. Irvine
 */
public class A157997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157997() {
    super(new long[] {-1, 2}, new long[] {287, 575});
  }
}
