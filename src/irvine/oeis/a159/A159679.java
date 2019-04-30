package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159679 <code>a(n)</code> are solutions of the 2 equations: <code>7*a(n)+1 = c(n)^2</code> and <code>9*a(n)+1 = b(n)^2</code>.
 * @author Sean A. Irvine
 */
public class A159679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159679() {
    super(new long[] {1, -255, 255}, new long[] {0, 32, 8160});
  }
}
