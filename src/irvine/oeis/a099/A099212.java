package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099212 a(n)=-2a(n-1)+4a(n-3).
 * @author Sean A. Irvine
 */
public class A099212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099212() {
    super(new long[] {4, 0, -2}, new long[] {1, 0, 0});
  }
}
