package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108012 a(n)= 8*a(n-1) -16*a(n-2) +4*a(n-4).
 * @author Sean A. Irvine
 */
public class A108012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108012() {
    super(new long[] {4, 0, -16, 8}, new long[] {0, 4, 18, 76});
  }
}
