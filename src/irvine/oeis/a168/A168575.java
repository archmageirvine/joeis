package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168575 a(n) = (10^n + 1)^3.
 * @author Sean A. Irvine
 */
public class A168575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168575() {
    super(new long[] {-1000000, 1111000, -112110, 1111}, new long[] {8, 1331, 1030301, 1003003001});
  }
}
