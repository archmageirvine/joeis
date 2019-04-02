package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046178 Indices of pentagonal numbers that are also hexagonal.
 * @author Sean A. Irvine
 */
public class A046178 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046178() {
    super(new long[] {1, -195, 195}, new long[] {1, 165, 31977});
  }
}
