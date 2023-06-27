package irvine.oeis.a281;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A281859 Curious identities based on the Armstrong number 407 = A005188(13).
 * @author Sean A. Irvine
 */
public class A281859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281859() {
    super(1, new long[] {-1000000, 1111000, -112110, 1111}, new long[] {407, 340067, 334000667, 333400006667L});
  }
}
