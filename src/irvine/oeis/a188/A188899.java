package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188899 Third row of array in A187617.
 * @author Sean A. Irvine
 */
public class A188899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188899() {
    super(new long[] {-1, 11, -25, 11}, new long[] {1, 5, 36, 281});
  }
}
