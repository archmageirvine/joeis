package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104009 Area of <code>(a,a,a+1)-integer</code> triangle. Corresponding a's are in <code>A103974</code>.
 * @author Sean A. Irvine
 */
public class A104009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104009() {
    super(new long[] {-1, 208, -2718, 208}, new long[] {0, 12, 1848, 351780});
  }
}
