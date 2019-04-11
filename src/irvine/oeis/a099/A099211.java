package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099211 <code>a(n)=-2a(n-1)+4a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A099211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099211() {
    super(new long[] {4, 0, -2}, new long[] {1, -2, 4});
  }
}
