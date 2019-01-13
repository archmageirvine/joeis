package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193068.
 * @author Sean A. Irvine
 */
public class A193068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193068() {
    super(new long[] {-1, 4, -6, 4}, new long[] {12, 42, 98, 188});
  }
}
