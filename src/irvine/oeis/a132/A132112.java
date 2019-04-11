package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132112 <code>a(n) = n*(n+1)*(11*n+1)/6</code>.
 * @author Sean A. Irvine
 */
public class A132112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132112() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 4, 23, 68});
  }
}
