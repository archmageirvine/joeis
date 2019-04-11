package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135522 <code>a(n) = 2*a(n-1) + 3*a(n-2),</code> with <code>a(0) = 2</code> and <code>a(1) = 3</code>.
 * @author Sean A. Irvine
 */
public class A135522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135522() {
    super(new long[] {3, 2}, new long[] {2, 3});
  }
}
