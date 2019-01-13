package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193608.
 * @author Sean A. Irvine
 */
public class A193608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193608() {
    super(new long[] {-1, 4, -6, 4}, new long[] {15, 52, 125, 246});
  }
}
