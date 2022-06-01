package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055338 Number of asymmetric (identity) trees with n nodes and 7 leaves.
 * @author Georg Fischer
 */
public class A055338 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055338() {
    super(8, A055278.computeRecurrence(7), "1, 13, 69, 276, 868, 2380, 5822, 13110, 27509, 54583, 103126, 187035, 327121, 554450, 913611, 1468364, 2307096, 3551916, 5367406, 7974550, 11664238, 16817964, 23927818, 33626390, 46715627, 64208789, 87371118, 117777552", 0);
  }
}

