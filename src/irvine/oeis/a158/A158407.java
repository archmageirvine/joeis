package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158407 <code>a(n) = 900*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A158407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158407() {
    super(new long[] {-1, 2}, new long[] {901, 1801});
  }
}
