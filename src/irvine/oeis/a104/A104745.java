package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104745 a(n) = 5^n + n.
 * @author Sean A. Irvine
 */
public class A104745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104745() {
    super(new long[] {5, -11, 7}, new long[] {1, 6, 27});
  }
}
