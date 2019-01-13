package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254136.
 * @author Sean A. Irvine
 */
public class A254136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254136() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {1, 73, 889, 84049, 1025713});
  }
}
