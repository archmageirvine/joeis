package irvine.oeis.a372;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A372723 Triangle read by rows: Column k has e.g.f. t^k / ((1 - t)^(k + 1) * exp(t)).
 * @author Sean A. Irvine
 */
public class A372723 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(mM, mN, j -> Z.NEG_ONE.pow(mN - j).multiply(Functions.FACTORIAL.z(j)).multiply(Binomial.binomial(mN, j)).multiply(Binomial.binomial(j, mM)));
  }
}

