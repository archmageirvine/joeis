package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174850.
 * @author Sean A. Irvine
 */
public class A174850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174850() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {0, 5, 15, 165, 20, 525, 195, 1085, 90, 1845, 575, 2805});
  }
}
