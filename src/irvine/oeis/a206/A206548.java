package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206548 Period 12: repeat <code>1, 5, 11, 13, 17, 19, 19, 17, 13, 11, 5, 1</code>.
 * @author Sean A. Irvine
 */
public class A206548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206548() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 5, 11, 13, 17, 19, 19, 17, 13, 11, 5, 1});
  }
}
