package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046196 Indices of square numbers which are also heptagonal.
 * @author Sean A. Irvine
 */
public class A046196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046196() {
    super(new long[] {-1, 0, 0, 1442, 0, 0}, new long[] {1, 9, 77, 1519, 12987, 111035});
  }
}
