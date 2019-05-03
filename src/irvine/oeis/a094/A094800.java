package irvine.oeis.a094;

import irvine.oeis.FiniteSequence;

/**
 * A094800 First term of a run of exactly two consecutive numbers such that for each m in the run, exactly m <code>1</code>'s are used in writing out all numbers 1 through m.
 * @author Georg Fischer
 */
public class A094800 extends FiniteSequence {

  /** Construct the sequence. */
  public A094800() {
    super(0, 200000, 2600000, 35000000, 35200000, 500000000L, 500200000L, 502600000L, 535000000L, 535200000L);
  }
}
