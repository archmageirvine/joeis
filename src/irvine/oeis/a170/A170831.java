package irvine.oeis.a170;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A170831 a(n) = 2^(floor(n/2))+2^(floor(n/2)-1)-2^(floor((n-1)/3)).
 * @author Sean A. Irvine
 */
public class A170831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170831() {
    super(2, new long[] {-4, 0, 2, 2, 0}, new long[] {2, 2, 4, 4, 10});
  }
}
