package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183156 The number <code>T(n)</code> of isometries of all subspaces of the finite metric space <code>{1,2,...,n}</code> (as a subspace of the reals with the Euclidean metric).
 * @author Sean A. Irvine
 */
public class A183156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183156() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 2, 7, 22});
  }
}
