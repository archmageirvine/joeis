package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233828.
 * @author Sean A. Irvine
 */
public class A233828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233828() {
    super(new long[] {1, 2, 2}, new long[] {-1, 1, 1});
  }
}
