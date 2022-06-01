package irvine.oeis.a124;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A124191 a(n) = ((2 + 3*sqrt(2))^n - (2 - 3*sqrt(2))^n)/(2*sqrt(2)).
 * @author Sean A. Irvine
 */
public class A124191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124191() {
    super(new long[] {14, 4}, new long[] {0, 3});
  }
}
