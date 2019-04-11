package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098878 <code>a(n) = (2^n - 1)^3 - 2</code>.
 * @author Sean A. Irvine
 */
public class A098878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098878() {
    super(new long[] {-64, 120, -70, 15}, new long[] {-2, -1, 25, 341});
  }
}
