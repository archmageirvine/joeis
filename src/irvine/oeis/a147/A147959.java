package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147959 a(n) = ((8 + sqrt(2))^n + (8 - sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A147959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147959() {
    super(new long[] {-62, 16}, new long[] {1, 8});
  }
}
