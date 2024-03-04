package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104743 a(n) = 3^n + n.
 * @author Sean A. Irvine
 */
public class A104743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104743() {
    super(new long[] {3, -7, 5}, new long[] {1, 4, 11});
  }
}
