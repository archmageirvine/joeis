package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027711.
 * @author Sean A. Irvine
 */
public class A027711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027711() {
    super(new long[] {-2, 1, 2, -5, 4}, new long[] {0, 1, 2, 4, 9});
  }
}
