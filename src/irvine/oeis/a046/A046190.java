package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046190 Indices of octagonal numbers which are also hexagonal numbers.
 * @author Sean A. Irvine
 */
public class A046190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046190() {
    super(new long[] {1, -99, 99}, new long[] {1, 63, 6141});
  }
}
