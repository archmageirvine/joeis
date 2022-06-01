package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083578 a(n) = (6^n + (-4)^n)/2.
 * @author Sean A. Irvine
 */
public class A083578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083578() {
    super(new long[] {24, 2}, new long[] {1, 1});
  }
}
