package irvine.oeis.a348;
// manually holsig/holos at 2022-09-29 22:19

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A348227 Coordination sequence for Wilkinson&apos;s 123-circle packing with respect to a circle of radius 1.
 * @author Georg Fischer
 */
public class A348227 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A348227() {
    super(0, "[0,-1,0,2,0,-1]", "1,4,12,20,34,38,54,54", 0);
  }
}
