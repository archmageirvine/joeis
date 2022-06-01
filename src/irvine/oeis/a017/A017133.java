package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017133 a(n) = (8*n + 5)^9.
 * @author Sean A. Irvine
 */
public class A017133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017133() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1953125, 10604499373L, 794280046581L, 14507145975869L, 129961739795077L, 756680642578125L, 3299763591802133L, 11694146092834141L, 35452087835576229L, 95151694449171437L});
  }
}
