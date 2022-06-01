package irvine.oeis.a277;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A277387 Number of nonnegative solutions of a certain system of linear Diophantine equations depending on an even parameter.
 * @author Sean A. Irvine
 */
public class A277387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277387() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 17, 138, 670, 2355, 6671, 16212});
  }
}
