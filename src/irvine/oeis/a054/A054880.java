package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054880 <code>a(n) = 3*(9^n - 1)/4</code>.
 * @author Sean A. Irvine
 */
public class A054880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054880() {
    super(new long[] {-9, 10}, new long[] {0, 6});
  }
}
