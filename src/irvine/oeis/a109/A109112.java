package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109112 <code>a(n) = 6*a(n-1) - 3*a(n-2), a(0)=2, a(1)=13</code>.
 * @author Sean A. Irvine
 */
public class A109112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109112() {
    super(new long[] {-3, 6}, new long[] {2, 13});
  }
}
