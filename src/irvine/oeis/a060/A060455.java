package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060455 7th-order Fibonacci numbers with <code>a(0)=...=a(6)=1</code>.
 * @author Sean A. Irvine
 */
public class A060455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060455() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1}, new long[] {1, 1, 1, 1, 1, 1, 1});
  }
}
