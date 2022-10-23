package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007008 Chvatal conjecture for radius of graph of maximal intersecting sets.
 * @author Sean A. Irvine
 */
public class A007008 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN - 2).subtract(Binomial.binomial(mN - 1, (mN - 1) / 2).divide2());
  }
}

