package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156813 a(n) = 225*n^2 - n.
 * @author Sean A. Irvine
 */
public class A156813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156813() {
    super(1, new long[] {1, -3, 3}, new long[] {224, 898, 2022});
  }
}
