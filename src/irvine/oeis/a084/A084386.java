package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084386 Number of pairs of rabbits when there are 3 pairs per litter and offspring reach parenthood after 3 gestation periods; <code>a(n) = a(n-1) + 3*a(n-3)</code>, with <code>a(0) = a(1) = a(2) = 1</code>.
 * @author Sean A. Irvine
 */
public class A084386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084386() {
    super(new long[] {3, 0, 1}, new long[] {1, 1, 1});
  }
}
