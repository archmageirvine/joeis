package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160538 a(n)=4(n^4-n^3).
 * @author Sean A. Irvine
 */
public class A160538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160538() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 32, 216, 768, 2000});
  }
}
