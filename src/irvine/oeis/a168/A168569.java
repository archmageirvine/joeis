package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168569 <code>a(n) = 9*(3^n - 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A168569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168569() {
    super(new long[] {-3, 4}, new long[] {0, 9});
  }
}
