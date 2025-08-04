package irvine.oeis.a079;

import irvine.oeis.Combiner;
import irvine.oeis.a001.A001329;
import irvine.oeis.a001.A001425;

/**
 * A079183 Number of isomorphism classes of non-commutative closed binary operations (groupoids) on a set of order n.
 * @author Sean A. Irvine
 */
public class A079183 extends Combiner {

  /** Construct the sequence. */
  public A079183() {
    super(1, new A001329().skip(), new A001425().skip(), SUBTRACT);
  }
}

