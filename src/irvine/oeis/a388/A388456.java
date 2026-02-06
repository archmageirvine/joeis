package irvine.oeis.a388;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a132.A132393;

/**
 * A388456 Triangle read by rows: coefficient [t^k] of the Ehrhart polynomial of the n-dimensional cross-polytope, multiplied by n!.
 * @author Sean A. Irvine
 */
public class A388456 extends Sequence0 {

  private final A132393 mA = new A132393();
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(0, mN, k -> Binomial.binomial(mN, k)
      .multiply(Integers.SINGLETON.sum(0, Math.min(mN - k, mM), j -> mA.get(mN - k + 1, j + 1).multiply(Functions.STIRLING1.z(k, mM - j)))));
  }
}
