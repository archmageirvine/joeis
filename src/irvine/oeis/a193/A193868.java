package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193868 Even central polygonal numbers.
 * @author Sean A. Irvine
 */
public class A193868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193868() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {2, 4, 16, 22, 46});
  }
}
