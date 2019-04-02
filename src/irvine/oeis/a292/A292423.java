package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292423 a(n) = 82*a(n-1) + a(n-2), where a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A292423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292423() {
    super(new long[] {1, 82}, new long[] {0, 1});
  }
}
