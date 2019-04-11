package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084479 Number of fault-free tilings of <code>a 5</code> X <code>3n</code> rectangle with right trominoes.
 * @author Sean A. Irvine
 */
public class A084479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084479() {
    super(new long[] {20, 40, 31, 2}, new long[] {72, 384, 3360, 21504});
  }
}
