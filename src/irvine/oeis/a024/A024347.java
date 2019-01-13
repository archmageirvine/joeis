package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024347.
 * @author Sean A. Irvine
 */
public class A024347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024347() {
    super(new long[] {-648, 882, -261, 28}, new long[] {1, 28, 523, 8218});
  }
}
