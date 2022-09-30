package irvine.oeis.a352;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A352433 Number of tilings of a 5 X 2n rectangle using dominoes and 2 X 2 tiles.
 * @author Georg Fischer
 */
public class A352433 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A352433() {
    super(0, "[0,-7680,17328,-13756,4822,-764,51,-1]", "1,21,593,17937,550969,16982489,523857737", 0);
  }
}
