package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016922 a(n) = (6*n+1)^2.
 * @author Sean A. Irvine
 */
public class A016922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016922() {
    super(new long[] {1, -3, 3}, new long[] {1, 49, 169});
  }
}
