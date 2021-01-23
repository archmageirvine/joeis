package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255463 a(n) = 3*4^n-2*3^n.
 * @author Sean A. Irvine
 */
public class A255463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255463() {
    super(new long[] {-12, 7}, new long[] {1, 6});
  }
}
