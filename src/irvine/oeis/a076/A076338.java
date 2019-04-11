package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076338 <code>a(n) = 512*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A076338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076338() {
    super(new long[] {-1, 2}, new long[] {1, 513});
  }
}
