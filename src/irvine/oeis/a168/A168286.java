package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168286 <code>a(n) = (6*n + 3*(-1)^n + 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A168286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168286() {
    super(new long[] {-1, 1, 1}, new long[] {2, 8, 8});
  }
}
