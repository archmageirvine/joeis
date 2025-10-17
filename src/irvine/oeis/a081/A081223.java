package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081223 Smallest k such that floor(k*gamma) begins with n (gamma=0.5772156649...).
 * @author Sean A. Irvine
 */
public class A081223 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long m = 1;
    while (true) {
      if (CR.GAMMA.multiply(++m).floor().toString().startsWith(s)) {
        return Z.valueOf(m);
      }
    }
  }
}
