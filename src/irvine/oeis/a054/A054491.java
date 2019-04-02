package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054491 a(n) = 4a(n-1) - a(n-2), a(0)=1, a(1)=6.
 * @author Sean A. Irvine
 */
public class A054491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054491() {
    super(new long[] {-1, 4}, new long[] {1, 6});
  }
}
