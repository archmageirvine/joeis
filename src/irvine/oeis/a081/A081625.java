package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081625 a(n) = 2*5^n - 3^n.
 * @author Sean A. Irvine
 */
public class A081625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081625() {
    super(new long[] {-15, 8}, new long[] {1, 7});
  }
}
