package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083423 <code>a(n) = (5*3^n + (-3)^n)/6</code>.
 * @author Sean A. Irvine
 */
public class A083423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083423() {
    super(new long[] {9, 0}, new long[] {1, 2});
  }
}
