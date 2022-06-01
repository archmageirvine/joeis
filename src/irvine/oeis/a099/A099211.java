package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099211 a(n)=-2a(n-1)+4a(n-3).
 * @author Sean A. Irvine
 */
public class A099211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099211() {
    super(new long[] {4, 0, -2}, new long[] {1, -2, 4});
  }
}
