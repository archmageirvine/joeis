package irvine.oeis.a203;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A203409 Indices of heptagonal numbers that are also decagonal.
 * @author Sean A. Irvine
 */
public class A203409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203409() {
    super(new long[] {1, -1, -1442, 1442, 1}, new long[] {1, 15, 1075, 21201, 1549717});
  }
}
