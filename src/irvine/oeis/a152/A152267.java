package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152267 <code>a(n) = ((9 + sqrt(8))^n + (9 - sqrt(8))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A152267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152267() {
    super(new long[] {-73, 18}, new long[] {1, 9});
  }
}
