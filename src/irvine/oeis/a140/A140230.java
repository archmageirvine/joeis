package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140230.
 * @author Sean A. Irvine
 */
public class A140230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140230() {
    super(new long[] {-4, 8, -8, 4}, new long[] {1, 3, 2, -6});
  }
}
