package irvine.oeis.a170;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A170834 a(n) = 5^(floor(n/2))+5^(floor(n/2)-1)-5^(floor((n-1)/3)).
 * @author Sean A. Irvine
 */
public class A170834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170834() {
    super(new long[] {-25, 0, 5, 5, 0}, new long[] {5, 5, 25, 25, 145});
  }
}
