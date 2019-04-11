package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055999 <code>a(n) = n*(n + 7)/2</code>.
 * @author Sean A. Irvine
 */
public class A055999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055999() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 9});
  }
}
