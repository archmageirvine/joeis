package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029549 <code>a(n + 3) = 35*a(n + 2) - 35*a(n + 1) + a(n)</code>, with <code>a(0) = 0, a(1) = 6, a(2) = 210</code>.
 * @author Sean A. Irvine
 */
public class A029549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029549() {
    super(new long[] {1, -35, 35}, new long[] {0, 6, 210});
  }
}
