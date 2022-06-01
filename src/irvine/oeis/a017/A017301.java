package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017301 a(n) = (10*n + 2)^9.
 * @author Sean A. Irvine
 */
public class A017301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017301() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {512, 5159780352L, 1207269217792L, 35184372088832L, 406671383849472L, 2779905883635712L, 13537086546263552L, 51998697814228992L, 167619550409708032L, 472161363286556672L});
  }
}
