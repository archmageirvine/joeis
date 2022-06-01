package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164045 a(n+1) = 5*a(n) - n.
 * @author Sean A. Irvine
 */
public class A164045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164045() {
    super(new long[] {5, -11, 7}, new long[] {1, 4, 18});
  }
}
