package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133455 a(n)=3a(n-1)-3a(n-2)+2a(n-3).
 * @author Sean A. Irvine
 */
public class A133455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133455() {
    super(new long[] {2, -3, 3}, new long[] {4, 2, 1});
  }
}
