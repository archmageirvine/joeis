package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105251 a(n) = binomial(n+4,n)*binomial(n+8,n).
 * @author Sean A. Irvine
 */
public class A105251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105251() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 45, 675, 5775, 34650, 162162, 630630, 2123550, 6370650, 17381650, 43801758, 103169430, 229265400});
  }
}
