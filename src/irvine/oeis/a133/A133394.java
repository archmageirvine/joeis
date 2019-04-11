package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133394 <code>a(n)=a(n-2)+a(n-5)</code>.
 * @author Sean A. Irvine
 */
public class A133394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133394() {
    super(new long[] {1, 0, 0, 1, 0}, new long[] {0, 2, 0, 2, 5});
  }
}
