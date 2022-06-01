package irvine.oeis.a221;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A221010 The Wiener index of the nanostar dendrimer G[n], defined pictorially in the Nadjafi-Arani et al. reference.
 * @author Sean A. Irvine
 */
public class A221010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221010() {
    super(new long[] {-32, 64, -42, 11}, new long[] {84, 2328, 23070, 161322});
  }
}
