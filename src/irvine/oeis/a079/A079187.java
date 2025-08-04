package irvine.oeis.a079;

import irvine.oeis.Combiner;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001329;

/**
 * A079187 Number of isomorphism classes of non-anti-commutative closed binary operations (groupoids) on a set of order n.
 * @author Sean A. Irvine
 */
public class A079187 extends Combiner {

  /** Construct the sequence. */
  public A079187() {
    super(1, new PrependSequence(new A001329().skip(2), 2), new A079190(), SUBTRACT);
  }
}

