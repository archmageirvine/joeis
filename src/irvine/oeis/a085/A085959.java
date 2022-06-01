package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085959 Multiples of 37.
 * @author Sean A. Irvine
 */
public class A085959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085959() {
    super(new long[] {-1, 2}, new long[] {0, 37});
  }
}
