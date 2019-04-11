package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108647 <code>a(n) = (n+1)^2*(n+2)^2*(n+3)^2*(n+4)/144</code>.
 * @author Sean A. Irvine
 */
public class A108647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108647() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 20, 150, 700, 2450, 7056, 17640, 39600});
  }
}
