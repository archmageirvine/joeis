package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221006 The Wiener index of the nanostar dendrimer NS[n], defined pictorially in the Karbasioun-Ashrafi-Diudea reference.
 * @author Sean A. Irvine
 */
public class A221006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221006() {
    super(new long[] {-32, 64, -42, 11}, new long[] {1296, 14526, 107082, 649890});
  }
}
