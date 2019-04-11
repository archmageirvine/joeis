package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147959 <code>a(n) = ((8 + sqrt(2))^n + (8 - sqrt(2))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A147959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147959() {
    super(new long[] {-62, 16}, new long[] {1, 8});
  }
}
