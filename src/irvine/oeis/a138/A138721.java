package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138721 Concatenation of n digits 1, n digits 0 and n digits 1.
 * @author Sean A. Irvine
 */
public class A138721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138721() {
    super(new long[] {-1000000, 1111000, -112110, 1111}, new long[] {101, 110011, 111000111, 111100001111L});
  }
}
