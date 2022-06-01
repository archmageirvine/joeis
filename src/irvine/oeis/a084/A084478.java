package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084478 Number of tilings of a 5 X 3n rectangle with right trominoes.
 * @author Sean A. Irvine
 */
public class A084478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084478() {
    super(new long[] {380, 280, 103, 2}, new long[] {72, 384, 8544, 76800}, 1, 0);
  }
}
