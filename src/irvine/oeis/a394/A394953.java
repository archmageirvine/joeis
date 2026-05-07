package irvine.oeis.a394;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A394953 allocated for Yu Hin Au.
 * @author Sean A. Irvine
 */
public class A394953 extends A394948 {

  @Override
  protected Z b(final long n) {
    return n == 1 ? Z.ONE : Integers.SINGLETON.sum(1, Math.min(4, n - 1), j -> Z.NEG_ONE.pow(j + 1).multiply(Binomial.binomial(4, j)).multiply(a(n - j)));
  }
}
