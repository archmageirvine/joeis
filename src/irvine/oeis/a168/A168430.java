package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168430 <code>a(n) = 4^n mod 13</code>.
 * @author Sean A. Irvine
 */
public class A168430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168430() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 4, 3, 12});
  }
}
