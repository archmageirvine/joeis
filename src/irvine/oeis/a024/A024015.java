package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024015 <code>2^n-n^5</code>.
 * @author Sean A. Irvine
 */
public class A024015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024015() {
    super(new long[] {2, -13, 36, -55, 50, -27, 8}, new long[] {1, 1, -28, -235, -1008, -3093, -7712});
  }
}
