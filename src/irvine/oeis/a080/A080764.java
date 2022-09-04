package irvine.oeis.a080;
// manually morfps at 2021-09-23

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A080764 First differences of A049472, floor(n/sqrt(2)).
 * @author Georg Fischer
 */
public class A080764 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A080764() {
    super("0", "1101", "0->1, 1->110");
  }
}
