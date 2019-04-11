package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099177 <code>a(n)=2a(n-1)+4a(n-2)-4a(n-3)-4a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A099177 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099177() {
    super(new long[] {-4, -4, 4, 2}, new long[] {0, 1, 2, 8});
  }
}
