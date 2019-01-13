package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114203.
 * @author Sean A. Irvine
 */
public class A114203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114203() {
    super(new long[] {2, 2, -5, 4}, new long[] {1, 2, 4, 8});
  }
}
