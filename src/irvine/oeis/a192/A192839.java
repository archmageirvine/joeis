package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192839 Molecular topological indices of the square graphs.
 * @author Sean A. Irvine
 */
public class A192839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192839() {
    super(1, new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 48, 768, 4320, 15360, 42000});
  }
}
