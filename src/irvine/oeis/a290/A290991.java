package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290991.
 * @author Sean A. Irvine
 */
public class A290991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290991() {
    super(new long[] {1, 1, -3, 5, -6, 4}, new long[] {0, 0, 1, 2, 3, 6});
  }
}
