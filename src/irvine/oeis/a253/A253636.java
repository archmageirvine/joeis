package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253636 Second partial sums of eighth powers (A001016).
 * @author Sean A. Irvine
 */
public class A253636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253636() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 258, 7076, 79430, 542409, 2685004, 10592400, 35277012, 103008345, 270739678, 652829892});
  }
}
