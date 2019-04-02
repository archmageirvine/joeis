package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017529 (12n)^9.
 * @author Sean A. Irvine
 */
public class A017529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017529() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 5159780352L, 2641807540224L, 101559956668416L, 1352605460594688L, 10077696000000000L, 51998697814228992L, 208215748530929664L, 692533995824480256L, 1999004627104432128L});
  }
}
