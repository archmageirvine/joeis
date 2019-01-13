package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221047.
 * @author Sean A. Irvine
 */
public class A221047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221047() {
    super(new long[] {19683, -45927, 40095, -17523, 4185, -549, 37}, new long[] {5, 406, 11458, 221572, 3519703, 49623850, 646314724});
  }
}
