package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061654 a(n) = (3*16^n + 2)/5.
 * @author Sean A. Irvine
 */
public class A061654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061654() {
    super(new long[] {-16, 17}, new long[] {1, 10});
  }
}
