package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178396 <code>a(n+1) = a(n)*1000 + 11^n</code> with <code>a(0)= 0</code>.
 * @author Sean A. Irvine
 */
public class A178396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178396() {
    super(new long[] {-11000, 1011}, new long[] {1, 1011});
  }
}
