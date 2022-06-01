package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083086 a(n) (2*2^n + (-4)^n)/3.
 * @author Sean A. Irvine
 */
public class A083086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083086() {
    super(new long[] {8, -2}, new long[] {1, 0});
  }
}
