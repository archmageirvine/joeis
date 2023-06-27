package irvine.oeis.a124;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A124313 Pentanacci numbers: a(n) = a(n-1) + a(n-2) + a(n-3) + a(n-4) + a(n-5), starting 1,0,0,0,1.
 * @author Sean A. Irvine
 */
public class A124313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124313() {
    super(1, new long[] {1, 1, 1, 1, 1}, new long[] {1, 0, 0, 0, 1});
  }
}
