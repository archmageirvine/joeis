package irvine.oeis.a139;
// manually triprom/triprov at 2023-05-31 18:05

import irvine.oeis.SkipSequence;
import irvine.oeis.a007.A007318;
import irvine.oeis.a026.A026741;
import irvine.oeis.triangle.VectorProduct;

/**
 * A139633 Triangle read by rows: binomial transform of a diagonalized matrix of A026741.
 * @author Georg Fischer
 */
public class A139633 extends VectorProduct {

  /** Construct the sequence. */
  public A139633() {
    super(1, new A007318(), new SkipSequence(new A026741(), 1));
  }
}
