package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281860 Curious identities based on the Armstrong number 371 = A005188(12).
 * @author Sean A. Irvine
 */
public class A281860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281860() {
    super(new long[] {-1000000, 1111000, -112110, 1111}, new long[] {371, 336701, 333667001, 333366670001L});
  }
}
