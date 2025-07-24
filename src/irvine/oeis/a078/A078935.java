package irvine.oeis.a078;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078935 Largest divisor of n*(n+1)/2 that is &lt;= sqrt(n*(n+1)/2).
 * @author Sean A. Irvine
 */
public class A078935 extends Sequence1 {

  protected long mN = 0;
  
  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    final Z[] d = Jaguar.factor(Functions.TRIANGULAR.z(mN)).divisorsSorted();
    return d[(d.length - 1) / 2];
  }
}
