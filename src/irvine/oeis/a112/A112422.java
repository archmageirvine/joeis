package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112422 Number of 6-element subsets of <code>{1,2,3,...,n}</code> for which the sum-set has 13 elements.
 * @author Sean A. Irvine
 */
public class A112422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112422() {
    super(new long[] {1, -1, 0, 0, 0, 0, -1, 0, 1, 0, 0, 0, 0, 1}, new long[] {3, 11, 19, 27, 35, 43, 54, 65, 81, 97, 113, 129, 148, 167});
  }
}
