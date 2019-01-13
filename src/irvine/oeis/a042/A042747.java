package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042747.
 * @author Sean A. Irvine
 */
public class A042747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042747() {
    super(new long[] {-1, 0, 902, 0}, new long[] {1, 15, 901, 13530});
  }
}
