package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105279 a(0)=0; a(n) = 10*a(n-1) + 10.
 * @author Sean A. Irvine
 */
public class A105279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105279() {
    super(new long[] {-10, 11}, new long[] {0, 10});
  }
}
