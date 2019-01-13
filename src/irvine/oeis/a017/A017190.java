package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017190.
 * @author Sean A. Irvine
 */
public class A017190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017190() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {64, 1771561, 64000000, 594823321, 3010936384L, 10779215329L, 30840979456L});
  }
}
