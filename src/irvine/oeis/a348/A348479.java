package irvine.oeis.a348;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A348479 Number of interval posets of permutations with n minimal elements.
 * @author Georg Fischer
 */
public class A348479 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A348479() {
    super(1, "[[0],[6252960,-5066622,1538241,-207387,10476],[-62441016,47878166,-12487565,1171171,-16564],[-108486144,180192856,-105886126,26525306,-2413832],[-1490880,-9976596,12702462,-4851570,590424],[-21604440,53390894,-46437875,16731073,-2079652],[0,-2406138,4276143,-2203473,333468]]", "1,1,3,12,52", 0);
  }
}
