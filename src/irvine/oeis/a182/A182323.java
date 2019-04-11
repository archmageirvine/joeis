package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182323 <code>a(n) = (194*n + 3*(-1)^n + 1)/4 + 24</code>.
 * @author Sean A. Irvine
 */
public class A182323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182323() {
    super(new long[] {-1, 1, 1}, new long[] {25, 72, 122});
  }
}
