package irvine.oeis.a146;

import irvine.oeis.FiniteSequence;

/**
 * A146207 Number of paths of the simple random walk on condition that the [n/2]th ordered value S_([n/2]) of the partial sums S_0=0, S_1,...,S_n, n odd (n=15 and S_(7) in this example), is equal to k, [ -n/2]-1&lt;=k&lt;=[n/2].
 * @author Georg Fischer
 */
public class A146207 extends FiniteSequence {

  /** Construct the sequence. */
  public A146207() {
    super(35, 70, 336, 602, 1456, 2310, 3760, 5210, 6435, 5210, 3270, 2310, 966, 602, 126, 70);
  }
}
