package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133360 Number of surjections from <code>an</code> n-element set to a nine-element set.
 * @author Sean A. Irvine
 */
public class A133360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133360() {
    super(new long[] {362880, -1026576, 1172700, -723680, 269325, -63273, 9450, -870, 45}, new long[] {362880, 16329600, 419126400, 8083152000L, 130456085760L, 1863435974400L, 24359586451200L, 297846188640000L, 3457819037312640L});
  }
}
