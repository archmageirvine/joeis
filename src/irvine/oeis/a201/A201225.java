package irvine.oeis.a201;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A201225 Values x for infinite sequence x^3-y^2 = d with decreasing coefficient r=sqrt(x)/d which tend to 1/(1350*sqrt(5))or infinity family of solutions Mordell curve with extension sqrt(5).
 * @author Sean A. Irvine
 */
public class A201225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201225() {
    super(new long[] {1, -341, 6138, -6138, 341}, new long[] {6100, 2305180, 748476100, 241118603980L, 77641444770100L});
  }
}
