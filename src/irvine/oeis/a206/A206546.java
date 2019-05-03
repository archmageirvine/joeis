package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206546 Period <code>8</code>: repeat <code>1, 7, 11, 13, 13, 11, 7, 1</code>.
 * @author Sean A. Irvine
 */
public class A206546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206546() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1}, new long[] {1, 7, 11, 13, 13, 11, 7});
  }
}
