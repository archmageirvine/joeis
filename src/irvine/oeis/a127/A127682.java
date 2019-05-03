package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127682 Number of <code>non-isomorphic (i.e.</code>, defined up to a rotation and a reflection) maximal independent sets of the n-cycle graph having at least one symmetry axis. Also: Number of cyclic and palindromic compositions of n in which each term is either 2 or 3.
 * @author Sean A. Irvine
 */
public class A127682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127682() {
    super(new long[] {1, 0, 1, 0, 0, 0}, new long[] {0, 1, 1, 1, 1, 2});
  }
}
