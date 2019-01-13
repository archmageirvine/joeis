package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271208.
 * @author Sean A. Irvine
 */
public class A271208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271208() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {-1, 1, 33, 245, 1027, 3129});
  }
}
