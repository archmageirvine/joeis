package irvine.oeis.a221;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A221011 The hyper-Wiener index of the nanostar dendrimer G[n], defined pictorially in the Nadjafi-Arani et al. reference.
 * @author Sean A. Irvine
 */
public class A221011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221011() {
    super(1, new long[] {128, -288, 232, -86, 15}, new long[] {159, 8934, 138021, 1343571, 10311135});
  }
}
