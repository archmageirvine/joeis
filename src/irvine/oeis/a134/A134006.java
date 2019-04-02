package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134006 a(n) = 1^n + 3^n + 5^n + 7^n.
 * @author Sean A. Irvine
 */
public class A134006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134006() {
    super(new long[] {-105, 176, -86, 16}, new long[] {4, 16, 84, 496});
  }
}
