package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051667 <code>a(n) = 6*2^n - 4*n - 6</code>.
 * @author Sean A. Irvine
 */
public class A051667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051667() {
    super(new long[] {2, -5, 4}, new long[] {0, 2, 10});
  }
}
