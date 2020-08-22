package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136249 a(n)=-a(n-1)+4*a(n-2)+4*a(n-3).
 * @author Sean A. Irvine
 */
public class A136249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136249() {
    super(new long[] {4, 4, -1}, new long[] {4, -2, 1});
  }
}
