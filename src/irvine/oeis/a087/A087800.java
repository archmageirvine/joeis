package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087800 <code>a(n) = 12*a(n-1) - a(n-2),</code> with <code>a(0) = 2</code> and <code>a(1) = 12</code>.
 * @author Sean A. Irvine
 */
public class A087800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087800() {
    super(new long[] {-1, 12}, new long[] {2, 12});
  }
}
