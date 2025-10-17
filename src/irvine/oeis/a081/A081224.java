package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081224 Smallest k such that floor(k*e^Pi) begins with n (e^Pi=23.14069264...).
 * @author Sean A. Irvine
 */
public class A081224 extends Sequence1 {

  private static final CR E_PI = CR.PI.exp();
  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long m = 0;
    while (true) {
      if (E_PI.multiply(++m).floor().toString().startsWith(s)) {
        return Z.valueOf(m);
      }
    }
  }
}
