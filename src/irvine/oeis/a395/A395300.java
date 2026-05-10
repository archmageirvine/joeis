package irvine.oeis.a395;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000203;
import irvine.oeis.a244.A244974;

/**
 * A395300 Sum of numbers k &lt; n such that rad(k) | n but k does not divide n, where rad = A007947.
 * @author Sean A. Irvine
 */
public class A395300 extends Combiner {

  /** Construct the sequence. */
  public A395300() {
    super(new A244974(), new A000203(), SUBTRACT);
  }
}
