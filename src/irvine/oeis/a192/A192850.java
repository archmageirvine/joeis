package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192850 Molecular topological indices of the web graphs.
 * @author Sean A. Irvine
 */
public class A192850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192850() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {46, 184, 414, 832, 1390, 2232});
  }
}
