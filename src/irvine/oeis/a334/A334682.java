package irvine.oeis.a334;
// Generated by gen_seq4.pl holos at 2021-05-08 19:57
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A334682 a(n) is the total number of down-steps after the final up-step in all 3-Dyck paths of length 4*n (n up-steps and 3*n down-steps).
 * @author Georg Fischer
 */
public class A334682 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A334682() {
    super(0, "[[0],[0, 2352,-9976,-10200, 50960, 10368,-58624],[-576, 2424, 2802,-10605,-8409, 8181, 6183]]", "[0, 3, 18]", 0);
  }
}
