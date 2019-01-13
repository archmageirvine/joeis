package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046173.
 * @author Sean A. Irvine
 */
public class A046173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046173() {
    super(new long[] {-1, 98}, new long[] {1, 99});
  }
}
