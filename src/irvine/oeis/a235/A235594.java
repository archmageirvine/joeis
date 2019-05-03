package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235594 Coefficient of <code>q^4</code> in the polynomial <code>NT_{n,mu}(q)</code>.
 * @author Sean A. Irvine
 */
public class A235594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235594() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {2, 23, 135, 561, 1870, 5328, 13476, 31020, 66132});
  }
}
