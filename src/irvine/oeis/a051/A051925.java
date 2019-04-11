package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051925 <code>a(n) = n*(2*n+5)*(n-1)/6</code>.
 * @author Sean A. Irvine
 */
public class A051925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051925() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 0, 3, 11});
  }
}
