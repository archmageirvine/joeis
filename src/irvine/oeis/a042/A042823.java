package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042823 Denominators of continued fraction convergents to sqrt(942).
 * @author Sean A. Irvine
 */
public class A042823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042823() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 212266, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 13, 263, 1065, 2393, 3458, 209873, 213331, 636535, 2759471, 55825955, 226063291, 507952537, 734015828});
  }
}
