package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098611 a(n) = 10^n-(-1)^n.
 * @author Sean A. Irvine
 */
public class A098611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098611() {
    super(new long[] {10, 9}, new long[] {0, 11});
  }
}
