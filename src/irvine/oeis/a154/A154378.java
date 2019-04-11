package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154378 <code>a(n) = 250*n - 10</code>.
 * @author Sean A. Irvine
 */
public class A154378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154378() {
    super(new long[] {-1, 2}, new long[] {240, 490});
  }
}
