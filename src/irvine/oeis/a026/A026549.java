package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026549 Ratios of successive terms are 2,3,2,3,2,3,2,3,...
 * @author Sean A. Irvine
 */
public class A026549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026549() {
    super(new long[] {6, 0}, new long[] {1, 2});
  }
}
