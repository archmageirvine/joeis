package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161007 a(n+1) = 2*a(n) + 16*a(n-1), a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A161007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161007() {
    super(new long[] {16, 2}, new long[] {0, 1});
  }
}
