package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067251.
 * @author Sean A. Irvine
 */
public class A067251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067251() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 11});
  }
}
