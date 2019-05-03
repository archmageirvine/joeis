package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252054 Number of perfect matchings in the <code>P_4 X C_n</code> graph.
 * @author Sean A. Irvine
 */
public class A252054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252054() {
    super(new long[] {1, -1, -13, 7, 61, -12, -128, 0, 128, 12, -61, -7, 13, 1}, new long[] {19, 121, 176, 725, 1471, 5041, 11989, 37584, 97021, 290521, 783511, 2289869, 6323504, 18241441});
  }
}
