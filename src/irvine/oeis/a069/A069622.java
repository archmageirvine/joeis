package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069622 Let Power(n) be the sequence of integer roots or powers of n. Power(1) is 1,1,1,1,... Power(4) is 1,2,4,16,64,256,... Power(27) is 1,3,9,27,729,... Power (p^k) is 1,p,p^a,p^b,...p^k, p^2k,p^3k,...where p is a prime and a,b etc. are divisors of k. This is the sequence of the n-th term of Power(n).
 * @author Sean A. Irvine
 */
public class A069622 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final int roots = Functions.SIGMA0.i(Jaguar.factor(++mN).minExponent());
    return Z.valueOf(mN).pow(mN - roots);
  }
}
