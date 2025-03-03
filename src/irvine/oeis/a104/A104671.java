package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104671 a(n) = binomial(n+3,n)*binomial(n+8,n).
 * @author Sean A. Irvine
 */
public class A104671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104671() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {1, 36, 450, 3300, 17325, 72072, 252252, 772200, 2123550, 5348200, 12514788, 27511848});
  }
}
