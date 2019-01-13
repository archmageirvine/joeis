package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128797.
 * @author Sean A. Irvine
 */
public class A128797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128797() {
    super(new long[] {27, -27, 9}, new long[] {0, 0, 18});
  }
}
