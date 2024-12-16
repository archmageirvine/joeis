package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083324 a(n) = 4^n - 3^n + 2^n.
 * @author Sean A. Irvine
 */
public class A083324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083324() {
    super(new long[] {24, -26, 9}, new long[] {1, 3, 11});
  }
}
