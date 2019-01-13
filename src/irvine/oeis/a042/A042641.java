package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042641.
 * @author Sean A. Irvine
 */
public class A042641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042641() {
    super(new long[] {-1, 0, 0, 0, 4898, 0, 0, 0}, new long[] {1, 6, 13, 84, 4885, 29394, 63673, 411432});
  }
}
