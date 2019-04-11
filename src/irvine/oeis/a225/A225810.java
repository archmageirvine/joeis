package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225810 <code>a(n) = (10^n)^2 + 4*(10^n) + 1</code>.
 * @author Sean A. Irvine
 */
public class A225810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225810() {
    super(new long[] {1000, -1110, 111}, new long[] {6, 141, 10401});
  }
}
