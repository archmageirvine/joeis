package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140966 a(n) = (5 + (-2)^n)/3.
 * @author Sean A. Irvine
 */
public class A140966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140966() {
    super(new long[] {2, -1}, new long[] {2, 1});
  }
}
