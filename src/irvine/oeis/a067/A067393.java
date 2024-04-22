package irvine.oeis.a067;

import irvine.factor.factor.PrimeDivision;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A067393 Number of nonprimes among the numbers in {1,2,3,...,n!} which are relatively prime to n!.
 * @author Sean A. Irvine
 */
public class A067393 extends A000142 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = -1;

  @Override
  public Z next() {
    final Z f = super.next();
    final Z phi = mFactor.factorize(f).phi();
    return phi.subtract(Functions.PRIME_PI.z(f)).add(Functions.PRIME_PI.l(++mN));
  }
}

