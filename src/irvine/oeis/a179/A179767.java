package irvine.oeis.a179;

import irvine.oeis.FiniteSequence;

/**
 * A179767 a(n) is the smallest prime of the form 4k + 3 such that the first n iterations of the map p -&gt; 4p + 3 are prime with the next iteration being composite.
 * @author Georg Fischer
 */
public class A179767 extends FiniteSequence {

  /** Construct the sequence. */
  public A179767() {
    super(3, 19, 7, 179, 1447, 32059, 55171, 17231, 32611);
  }
}
