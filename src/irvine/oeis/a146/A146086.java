package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146086 Number of n-digit numbers with each digit odd where the digits 1 and 3 occur an even number of times.
 * @author Sean A. Irvine
 */
public class A146086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146086() {
    super(new long[] {15, -23, 9}, new long[] {3, 11, 45});
  }
}
