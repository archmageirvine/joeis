package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168611 <code>a(n) = 3^n - 4</code>.
 * @author Sean A. Irvine
 */
public class A168611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168611() {
    super(new long[] {-3, 4}, new long[] {-3, -1});
  }
}
