package irvine.oeis.a078;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078220 Smallest k such that floor(k*Pi) begins with n (Pi=3.14159...).
 * @author Sean A. Irvine
 */
public class A078220 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long k = 0;
    while (true) {
      if (CR.PI.multiply(++k).floor().toString().startsWith(s)) {
        return Z.valueOf(k);
      }
    }
  }
}

