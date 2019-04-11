package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168283 <code>a(n) = (10*n - 5*(-1)^n - 3)/4</code>.
 * @author Sean A. Irvine
 */
public class A168283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168283() {
    super(new long[] {-1, 1, 1}, new long[] {3, 3, 8});
  }
}
