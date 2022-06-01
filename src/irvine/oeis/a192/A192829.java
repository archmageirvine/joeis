package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192829 Molecular topological indices of the n X n X n grid graphs.
 * @author Sean A. Irvine
 */
public class A192829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192829() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {360, 8064, 68928, 355470, 1340424, 4086180, 10680384, 24847938});
  }
}
