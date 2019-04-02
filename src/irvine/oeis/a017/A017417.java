package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017417 a(n) = (11*n+2)^5.
 * @author Sean A. Irvine
 */
public class A017417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017417() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {32, 371293, 7962624, 52521875, 205962976, 601692057});
  }
}
