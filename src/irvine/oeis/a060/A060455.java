package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060455 7th-order Fibonacci numbers with a(0)=...=a(6)=1.
 * @author Sean A. Irvine
 */
public class A060455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060455() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1}, new long[] {1, 1, 1, 1, 1, 1, 1});
  }
}
