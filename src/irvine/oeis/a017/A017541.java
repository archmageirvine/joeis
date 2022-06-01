package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017541 (12n+1)^9.
 * @author Sean A. Irvine
 */
public class A017541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017541() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 10604499373L, 3814697265625L, 129961739795077L, 1628413597910449L, 11694146092834141L, 58871586708267913L, 231616946283203125L, 760231058654565217L, 2171893279442309389L});
  }
}
