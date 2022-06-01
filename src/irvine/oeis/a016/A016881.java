package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016881 (5n+2)^9.
 * @author Sean A. Irvine
 */
public class A016881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016881() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {512, 40353607, 5159780352L, 118587876497L, 1207269217792L, 7625597484987L, 35184372088832L, 129961739795077L, 406671383849472L, 1119130473102767L});
  }
}
