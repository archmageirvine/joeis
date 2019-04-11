package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056449 <code>a(n) = 3^floor((n+1)/2)</code>.
 * @author Sean A. Irvine
 */
public class A056449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056449() {
    super(new long[] {3, 0}, new long[] {1, 3});
  }
}
