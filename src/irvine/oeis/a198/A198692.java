package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198692 <code>a(n) = 11*7^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198692 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198692() {
    super(new long[] {-7, 8}, new long[] {10, 76});
  }
}
