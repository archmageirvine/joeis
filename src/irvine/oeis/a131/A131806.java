package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131806 Period 4: repeat [0, 2, 4, 6].
 * @author Sean A. Irvine
 */
public class A131806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131806() {
    super(new long[] {1, 0, 0, 0}, new long[] {0, 2, 4, 6});
  }
}
