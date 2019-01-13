package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125909.
 * @author Sean A. Irvine
 */
public class A125909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125909() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {9, 79, 681, 5791, 48729, 405919, 3340521});
  }
}
