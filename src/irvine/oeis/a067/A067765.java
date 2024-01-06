package irvine.oeis.a067;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A067765 Order of linear Heyting semi-lattice on n points.
 * @author Sean A. Irvine
 */
public class A067765 extends CachedSequence {

  /** Construct the sequence. */
  public A067765() {
    super(0, Integer.class, (self, k) -> k == 0 ? Z.ONE : Integers.SINGLETON.product(0, k - 1, j -> self.a(j).add(1).pow(Binomial.binomial(k, j))));
  }
}
