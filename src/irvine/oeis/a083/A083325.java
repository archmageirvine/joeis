package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083325 a(n) = 5^n - 4^n + 3^n.
 * @author Sean A. Irvine
 */
public class A083325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083325() {
    super(new long[] {60, -47, 12}, new long[] {1, 4, 18});
  }
}
