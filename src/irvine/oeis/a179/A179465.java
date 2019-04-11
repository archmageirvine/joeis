package irvine.oeis.a179;

import irvine.oeis.FiniteSequence;

/**
 * A179465 Integers of alternate form <code>x+(x+1)^2+(x+2)^3+(x+3)^4+(x+4)^5+(x+5)^6</code>.
 * @author Georg Fischer
 */
public class A179465 extends FiniteSequence {

  /** Construct the sequence. */
  public A179465() {
    super(1, 31, 396, 2673, 10076, 20153, 16739);
  }
}
