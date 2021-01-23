package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196279 Let r= (7n) mod 10 and x=floor(7n/10) be the last digit and leading part of 7n. Then a(n) = (x-2r)/7.
 * @author Sean A. Irvine
 */
public class A196279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196279() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, -2, -1, 0, -2, -1, 0, -2, -1, 0, 1});
  }
}
