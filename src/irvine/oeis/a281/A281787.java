package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281787 <code>a(n) =</code> sum of all numbers between 1 and <code>10^n</code> that are divisible by 3 or 5.
 * @author Sean A. Irvine
 */
public class A281787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281787() {
    super(new long[] {1000, -1110, 111}, new long[] {23, 2318, 233168});
  }
}
