package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112033 3 * 2^(floor(n/2) + 1 + (-1)^n).
 * @author Sean A. Irvine
 */
public class A112033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112033() {
    super(new long[] {2, 0}, new long[] {12, 3});
  }
}
