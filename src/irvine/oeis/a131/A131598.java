package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131598 Period 3: repeat [2, 5, 8].
 * @author Sean A. Irvine
 */
public class A131598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131598() {
    super(new long[] {1, 0, 0}, new long[] {2, 5, 8});
  }
}
