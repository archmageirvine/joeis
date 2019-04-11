package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178208 Number of ways to choose three points in <code>an (n</code> X n)-grid (or geoplane).
 * @author Sean A. Irvine
 */
public class A178208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178208() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 4, 84, 560, 2300, 7140, 18424});
  }
}
