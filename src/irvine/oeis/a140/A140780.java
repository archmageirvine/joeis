package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140780 a(n) = 10*a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A140780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140780() {
    super(new long[] {-1, 10}, new long[] {1, 3});
  }
}
