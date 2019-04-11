package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228472 <code>a(n) = 6*a(n-2) + a(n-4),</code> where <code>a(0) = 5, a(1) = 8, a(2) = 30, a(3) = 49</code>.
 * @author Sean A. Irvine
 */
public class A228472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228472() {
    super(new long[] {1, 0, 6, 0}, new long[] {5, 8, 30, 49});
  }
}
