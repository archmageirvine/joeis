package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154626 <code>a(n) = 2^n*A001519(n)</code>.
 * @author Sean A. Irvine
 */
public class A154626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154626() {
    super(new long[] {-4, 6}, new long[] {1, 2});
  }
}
