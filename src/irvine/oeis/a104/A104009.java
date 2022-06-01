package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104009 Area of (a,a,a+1)-integer triangle. Corresponding a's are in A103974.
 * @author Sean A. Irvine
 */
public class A104009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104009() {
    super(new long[] {-1, 208, -2718, 208}, new long[] {0, 12, 1848, 351780});
  }
}
