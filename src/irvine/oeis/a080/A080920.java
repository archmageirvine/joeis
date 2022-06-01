package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080920 a(n) = 2a(n-1) + 35a(n-2), a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A080920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080920() {
    super(new long[] {35, 2}, new long[] {0, 1});
  }
}
