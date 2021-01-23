package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084240 a(n) = -5*a(n-1) - 4*a(n-2), a(0)=1, a(1)=0.
 * @author Sean A. Irvine
 */
public class A084240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084240() {
    super(new long[] {-4, -5}, new long[] {1, 0});
  }
}
