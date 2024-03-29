package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103379 k=11 case of family of sequences beyond Fibonacci and Padovan.
 * @author Sean A. Irvine
 */
public class A103379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103379() {
    super(1, new long[] {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
