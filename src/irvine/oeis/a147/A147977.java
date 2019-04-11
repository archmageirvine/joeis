package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147977 <code>6^n-5^n-4^n-3^n-2^n-1</code>.
 * @author Sean A. Irvine
 */
public class A147977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147977() {
    super(new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {-4, -9, -19, -9, 317, 3351});
  }
}
