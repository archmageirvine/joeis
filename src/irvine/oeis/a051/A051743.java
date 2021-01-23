package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051743 a(n) = (1/24)*n*(n + 5)*(n^2 + n + 6).
 * @author Sean A. Irvine
 */
public class A051743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051743() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {2, 7, 18, 39, 75});
  }
}
