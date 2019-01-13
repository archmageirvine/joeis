package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155944.
 * @author Sean A. Irvine
 */
public class A155944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155944() {
    super(new long[] {-2, 1, 2}, new long[] {0, 2, 1});
  }
}
