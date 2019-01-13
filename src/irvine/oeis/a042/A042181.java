package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042181.
 * @author Sean A. Irvine
 */
public class A042181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042181() {
    super(new long[] {-1, 0, 0, 0, 248, 0, 0, 0}, new long[] {1, 1, 4, 5, 244, 249, 991, 1240});
  }
}
