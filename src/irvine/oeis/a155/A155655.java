package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155655 8^n+7^n-1^n.
 * @author Sean A. Irvine
 */
public class A155655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155655() {
    super(new long[] {56, -71, 16}, new long[] {1, 14, 112});
  }
}
