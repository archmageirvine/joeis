package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099216 <code>a(n)=4a(n-1)-4a(n-2)+2a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A099216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099216() {
    super(new long[] {2, -4, 4}, new long[] {1, 2, 4});
  }
}
