package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132270 <code>a(n) = floor((n^7-1)/(7*n^6))</code>, which is the same as integers repeated 7 times.
 * @author Sean A. Irvine
 */
public class A132270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132270() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 1});
  }
}
