package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046173 Indices of square numbers that are also pentagonal.
 * @author Sean A. Irvine
 */
public class A046173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046173() {
    super(new long[] {-1, 98}, new long[] {1, 99});
  }
}
