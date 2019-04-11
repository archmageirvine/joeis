package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168409 <code>a(n) = 8 + 9*floor((n-1)/2)</code>.
 * @author Sean A. Irvine
 */
public class A168409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168409() {
    super(new long[] {-1, 1, 1}, new long[] {8, 8, 17});
  }
}
