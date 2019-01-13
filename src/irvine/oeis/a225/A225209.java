package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225209.
 * @author Sean A. Irvine
 */
public class A225209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225209() {
    super(new long[] {-512, 736, -252, 29}, new long[] {1, 249, 8537, 186073});
  }
}
