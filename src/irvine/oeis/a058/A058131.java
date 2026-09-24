package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A058131 Number of isomorphism classes of commutative monoids (commutative semigroups with identity) of order n.
 * @author Georg Fischer
 */
public class A058131 extends PrependSequence {

  /** Construct the sequence. */
  public A058131() {
    super(0, new RowSumSequence(new A058142()), 0);
  }
}
