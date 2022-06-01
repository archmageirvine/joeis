package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017312 a(n) = (10*n + 3)^8.
 * @author Sean A. Irvine
 */
public class A017312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017312() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {6561, 815730721, 78310985281L, 1406408618241L, 11688200277601L, 62259690411361L, 248155780267521L, 806460091894081L, 2252292232139041L});
  }
}
