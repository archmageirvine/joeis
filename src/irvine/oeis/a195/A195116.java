package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195116.
 * @author Sean A. Irvine
 */
public class A195116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195116() {
    super(new long[] {-36, 72, -47, 12}, new long[] {12, 25, 77, 319});
  }
}
