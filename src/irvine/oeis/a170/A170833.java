package irvine.oeis.a170;

import irvine.oeis.LinearRecurrence;

/**
 * A170833 <code>a(n) = 4^(floor(n/2))+4^(floor(n/2)-1)-4^(floor((n-1)/3))</code>.
 * @author Sean A. Irvine
 */
public class A170833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170833() {
    super(new long[] {-16, 0, 4, 4, 0}, new long[] {4, 4, 16, 16, 76});
  }
}
