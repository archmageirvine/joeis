package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222740 Denominators of <code>1/16 - 1/(4 + 8*n)^2</code>.
 * @author Sean A. Irvine
 */
public class A222740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222740() {
    super(new long[] {1, -3, 6, -10, 12, -12, 10, -6, 3}, new long[] {1, 18, 50, 49, 81, 242, 338, 225, 289});
  }
}
