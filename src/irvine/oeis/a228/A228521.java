package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228521 x-values in the solution to the Pell equation <code>x^2 - 29*y^2 = -1</code>.
 * @author Sean A. Irvine
 */
public class A228521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228521() {
    super(new long[] {-1, 19602}, new long[] {70, 1372210});
  }
}
