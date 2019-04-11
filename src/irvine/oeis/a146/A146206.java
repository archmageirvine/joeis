package irvine.oeis.a146;

import irvine.oeis.FiniteSequence;

/**
 * A146206 Number of paths of the simple random walk on condition that the median applied to the partial sums S_0=0, S_1,...,S_n, n odd <code>(n=15</code> in this example), is equal to integer values k, -[n/2]&lt;=k&lt;=[n/2].
 * @author Georg Fischer
 */
public class A146206 extends FiniteSequence {

  /** Construct the sequence. */
  public A146206() {
    super(35, 91, 357, 721, 1575, 2535, 3985, 5210, 3985, 2535, 1575, 721, 357, 91, 35);
  }
}
