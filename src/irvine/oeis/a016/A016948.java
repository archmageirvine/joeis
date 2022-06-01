package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016948 a(n) = (6*n + 3)^4.
 * @author Sean A. Irvine
 */
public class A016948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016948() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {81, 6561, 50625, 194481, 531441});
  }
}
