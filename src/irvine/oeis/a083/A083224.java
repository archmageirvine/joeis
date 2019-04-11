package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083224 <code>a(n) = (6*7^n + (-7)^n)/7</code>.
 * @author Sean A. Irvine
 */
public class A083224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083224() {
    super(new long[] {49, 0}, new long[] {1, 5});
  }
}
