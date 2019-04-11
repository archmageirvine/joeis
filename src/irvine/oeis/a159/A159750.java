package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159750 Positive numbers y such that y^2 is of the form <code>x^2+(x+47)^2</code> with integer x.
 * @author Sean A. Irvine
 */
public class A159750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159750() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {37, 47, 65, 157, 235, 353});
  }
}
