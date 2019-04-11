package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076040 <code>(-1)^n * (3^n - 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A076040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076040() {
    super(new long[] {-3, -4}, new long[] {0, -1});
  }
}
