package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051500 <code>a(n) = (3^n+1)^2/4</code>.
 * @author Sean A. Irvine
 */
public class A051500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051500() {
    super(new long[] {27, -39, 13}, new long[] {1, 4, 25});
  }
}
