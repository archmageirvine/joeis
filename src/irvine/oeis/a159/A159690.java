package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159690 Positive numbers y such that <code>y^2</code> is of the form <code>x^2+(x+881)^2</code> with integer x.
 * @author Sean A. Irvine
 */
public class A159690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159690() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {841, 881, 925, 4121, 4405, 4709});
  }
}
