package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140992.
 * @author Sean A. Irvine
 */
public class A140992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140992() {
    super(new long[] {1, 1, -3, -1, 3}, new long[] {0, 1, 2, 5, 11});
  }
}
