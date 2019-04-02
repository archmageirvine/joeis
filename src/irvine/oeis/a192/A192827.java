package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192827 Molecular topological indices of the gear graphs.
 * @author Sean A. Irvine
 */
public class A192827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192827() {
    super(new long[] {1, -3, 3}, new long[] {11, 88, 231});
  }
}
