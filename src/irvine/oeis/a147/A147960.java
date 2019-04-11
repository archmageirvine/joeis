package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147960 <code>a(n) = ((9 + sqrt(2))^n + (9 - sqrt(2))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A147960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147960() {
    super(new long[] {-79, 18}, new long[] {1, 9});
  }
}
