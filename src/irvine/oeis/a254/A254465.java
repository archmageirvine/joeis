package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254465 <code>a(n) = 35*2^n + 10*4^n + 20*3^n + 4*5^n + 6^n + 56</code>.
 * @author Sean A. Irvine
 */
public class A254465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254465() {
    super(new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {126, 252, 672, 2232, 8592, 36552});
  }
}
