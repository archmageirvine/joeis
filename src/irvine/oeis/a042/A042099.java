package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042099.
 * @author Sean A. Irvine
 */
public class A042099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042099() {
    super(new long[] {-1, 0, 0, 0, 766, 0, 0, 0}, new long[] {1, 1, 15, 16, 751, 767, 11489, 12256});
  }
}
