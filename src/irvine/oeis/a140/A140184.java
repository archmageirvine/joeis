package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140184.
 * @author Sean A. Irvine
 */
public class A140184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140184() {
    super(new long[] {16, 16, 2}, new long[] {1, 14, 60});
  }
}
