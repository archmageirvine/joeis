package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059100 <code>a(n) = n^2 + 2</code>.
 * @author Sean A. Irvine
 */
public class A059100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059100() {
    super(new long[] {1, -3, 3}, new long[] {2, 3, 6});
  }
}
