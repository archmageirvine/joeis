package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221003 The hyper-Wiener index of the nanostar dendrimer <code>G[n]</code>, defined pictorially in the Karbasioun-Ashrafi reference.
 * @author Sean A. Irvine
 */
public class A221003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221003() {
    super(new long[] {512, -1664, 2208, -1560, 636, -150, 19}, new long[] {192133, 1790789, 13716357, 92392837, 568494213, 3272754309L, 17914312837L});
  }
}
