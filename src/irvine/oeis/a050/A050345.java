package irvine.oeis.a050;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a045.A045778;
import irvine.oeis.memory.MemorySequence;

/**
 * A050349 Number of ways to factor n into distinct factors with 3 levels of parentheses.
 * @author Sean A. Irvine
 */
public class A050345 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A045778());
  private int mN = 0;
  private Ds mDs = Dgf.one();

  @Override
  public Z next() {
    if (++mN >= 2) {
      mDs = Dgf.multiply(mDs, Dgf.pow(Dgf.simple(mN), mA.a(mN - 1)));
    }
    return mDs.coeff(mN);
  }
}
