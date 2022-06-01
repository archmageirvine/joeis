package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132951 Period 6: 1, 3, 1, -1, -3, -1.
 * @author Sean A. Irvine
 */
public class A132951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132951() {
    super(new long[] {-1, 0, 0}, new long[] {1, 3, 1});
  }
}
