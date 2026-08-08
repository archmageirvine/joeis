package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A086227 a(n) = Sum_{1&lt;=k&lt;=4*n, gcd(k,n)=1} (i^k*tan(k*Pi/(4*n)))/(4*i), where i is the imaginary unit.
 * @author Sean A. Irvine
 */
public class A086227 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    CR sum = CR.ZERO;
    for (long k = 1; k <= 2 * mN; ++k) {
      if (Functions.GCD.l(2 * k - 1, mN) == 1) {
        final CR t = CR.PI.multiply(new Q(2 * k - 1, 4 * mN)).tan();
        sum = sum.signedAdd((k & 1) == 1, t);
      }
    }
    return sum.divide(4).round();
  }
}

