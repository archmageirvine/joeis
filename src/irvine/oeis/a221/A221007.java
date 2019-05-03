package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221007 The hyper-Wiener index of the nanostar dendrimer <code>NS[n]</code>, defined pictorially in the <code>Karbasioun-Ashrafi-Diudea</code> reference.
 * @author Sean A. Irvine
 */
public class A221007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221007() {
    super(new long[] {128, -288, 232, -86, 15}, new long[] {4470, 80313, 838203, 6691695, 45640599});
  }
}
