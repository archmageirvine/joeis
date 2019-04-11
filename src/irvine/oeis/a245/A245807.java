package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245807 <code>7^n + 10^n</code>.
 * @author Sean A. Irvine
 */
public class A245807 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245807() {
    super(new long[] {-70, 17}, new long[] {2, 17});
  }
}
