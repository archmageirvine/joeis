package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274526 a(n) = ((1 + sqrt(11))^n - (1 - sqrt(11))^n)/sqrt(11).
 * @author Sean A. Irvine
 */
public class A274526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274526() {
    super(new long[] {10, 2}, new long[] {0, 2});
  }
}
