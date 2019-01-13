package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179991.
 * @author Sean A. Irvine
 */
public class A179991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179991() {
    super(new long[] {1, -1, -2, 3}, new long[] {2, 3, 8, 15});
  }
}
