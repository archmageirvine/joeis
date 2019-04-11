package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099215 <code>a(n)=4a(n-1)-4a(n-2)+3a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A099215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099215() {
    super(new long[] {3, -4, 4}, new long[] {1, 2, 4});
  }
}
