package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193828 Even generalized pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A193828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193828() {
    super(new long[] {1, -3, 5, -7, 7, -5, 3}, new long[] {0, 2, 12, 22, 26, 40, 70});
  }
}
