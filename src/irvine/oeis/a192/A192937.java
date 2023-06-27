package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192937 a(n) = 100*a(n-1) - (n-1) with a(1)=100.
 * @author Sean A. Irvine
 */
public class A192937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192937() {
    super(1, new long[] {100, -201, 102}, new long[] {100, 9999, 999898});
  }
}
