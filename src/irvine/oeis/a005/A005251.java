package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005251.
 * @author Sean A. Irvine
 */
public class A005251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005251() {
    super(new long[] {1, 0, 1, 1}, new long[] {0, 1, 1, 1});
  }
}

