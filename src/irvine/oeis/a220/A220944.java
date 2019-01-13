package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220944.
 * @author Sean A. Irvine
 */
public class A220944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220944() {
    super(new long[] {-3, 0, 4, 0}, new long[] {1, 3, 9, 11});
  }
}
