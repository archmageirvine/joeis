package irvine.oeis.a179;

import irvine.oeis.FiniteSequence;

/**
 * A179767 <code>a(n)</code> is the smallest prime of the form <code>4k + 3</code> such that the first n iterations of the map p <code>-&gt</code>; 4p <code>+ 3</code> are prime with the next iteration being composite.
 * @author Georg Fischer
 */
public class A179767 extends FiniteSequence {

  /** Construct the sequence. */
  public A179767() {
    super(3, 19, 7, 179, 1447, 32059, 55171, 17231, 32611);
  }
}
