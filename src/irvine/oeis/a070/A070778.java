package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070778.
 * @author Sean A. Irvine
 */
public class A070778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070778() {
    super(new long[] {1, 1, -5, -4, 6, 3}, new long[] {1, 2, 11, 41, 176, 721});
  }
}
