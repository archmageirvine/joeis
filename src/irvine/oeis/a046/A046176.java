package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046176 Indices of square numbers that are also hexagonal.
 * @author Sean A. Irvine
 */
public class A046176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046176() {
    super(new long[] {-1, 34}, new long[] {1, 35});
  }
}
