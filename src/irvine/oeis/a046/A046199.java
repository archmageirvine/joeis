package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046199 Indices of pentagonal numbers that are also heptagonal.
 * @author Sean A. Irvine
 */
public class A046199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046199() {
    super(new long[] {1, -63, 63}, new long[] {1, 54, 3337});
  }
}
