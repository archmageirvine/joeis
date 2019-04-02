package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046179 Indices of hexagonal numbers that are also pentagonal.
 * @author Sean A. Irvine
 */
public class A046179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046179() {
    super(new long[] {1, -195, 195}, new long[] {1, 143, 27693});
  }
}
