package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193046.
 * @author Sean A. Irvine
 */
public class A193046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193046() {
    super(new long[] {1, -3, 1, 6, -9, 5}, new long[] {1, 1, 17, 83, 275, 727});
  }
}
