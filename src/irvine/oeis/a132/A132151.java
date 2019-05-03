package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132151 Period <code>8</code>: repeat <code>0, 1, 0, 0, 0, 0, -1, 0</code>.
 * @author Sean A. Irvine
 */
public class A132151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132151() {
    super(new long[] {-1, -1, -1, -1, -1, -1, -1}, new long[] {0, 1, 0, 0, 0, 0, -1});
  }
}
