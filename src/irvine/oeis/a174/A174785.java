package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174785.
 * @author Sean A. Irvine
 */
public class A174785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174785() {
    super(new long[] {-1, 0, 0, -2, 0, 0}, new long[] {1, 2, -1, -1, -5, 1});
  }
}
