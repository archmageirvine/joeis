package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147962 <code>a(n) = ((7+sqrt(3))^n + (7-sqrt(3))^n) / 2</code>.
 * @author Sean A. Irvine
 */
public class A147962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147962() {
    super(new long[] {-46, 14}, new long[] {1, 7});
  }
}
