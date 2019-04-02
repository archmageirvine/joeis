package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155651 8^n-6^n+1^n.
 * @author Sean A. Irvine
 */
public class A155651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155651() {
    super(new long[] {48, -62, 15}, new long[] {1, 3, 29});
  }
}
