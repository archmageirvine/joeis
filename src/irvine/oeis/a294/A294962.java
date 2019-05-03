package irvine.oeis.a294;

import irvine.oeis.FiniteSequence;

/**
 * A294962 <code>a(n)</code> is the total number of elements after n-th stage of a hybrid <code>(and finite)</code> cellular automaton formed by toothpicks, D-toothpicks and T-toothpicks on the infinite square grid (see Comments lines for precise <code>definition)</code>.
 * @author Georg Fischer
 */
public class A294962 extends FiniteSequence {

  /** Construct the sequence. */
  public A294962() {
    super(0, 1, 5, 13, 21, 33, 53, 69, 77, 101, 117);
  }
}
