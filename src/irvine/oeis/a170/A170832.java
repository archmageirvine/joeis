package irvine.oeis.a170;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A170832 a(n) = 3^(floor(n/2))+3^(floor(n/2)-1)-3^(floor((n-1)/3)).
 * @author Sean A. Irvine
 */
public class A170832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170832() {
    super(new long[] {-9, 0, 3, 3, 0}, new long[] {3, 3, 9, 9, 33});
  }
}
