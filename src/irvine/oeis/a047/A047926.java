package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047926 a(n) = (3^(n+1) + 2*n + 1)/4.
 * @author Sean A. Irvine
 */
public class A047926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047926() {
    super(new long[] {3, -7, 5}, new long[] {1, 3, 8});
  }
}
