package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085292.
 * @author Sean A. Irvine
 */
public class A085292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085292() {
    super(new long[] {-1, 2, 7, 2}, new long[] {1, 9, 28, 119});
  }
}
