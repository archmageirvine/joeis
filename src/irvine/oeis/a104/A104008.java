package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104008 Area of <code>(m,m+1,m+1)-integer</code> triangle for m in <code>A103975</code>.
 * @author Sean A. Irvine
 */
public class A104008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104008() {
    super(new long[] {-1, 208, -2718, 208}, new long[] {120, 25080, 4890480, 949077360});
  }
}
