package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045991.
 * @author Sean A. Irvine
 */
public class A045991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045991() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 0, 4, 18});
  }
}
