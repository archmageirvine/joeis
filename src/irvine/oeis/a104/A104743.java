package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104743 Numbers m = n + 3^n such that the equation x = 3^(m-x) has solution x = 3^n.
 * @author Sean A. Irvine
 */
public class A104743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104743() {
    super(new long[] {3, -7, 5}, new long[] {1, 4, 11});
  }
}
