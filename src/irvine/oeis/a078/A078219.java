package irvine.oeis.a078;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078219 Smallest k such that floor(k*e) begins with n (e = 2.718281828...).
 * @author Sean A. Irvine
 */
public class A078219 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long k = 0;
    while (true) {
      if (CR.E.multiply(++k).floor().toString().startsWith(s)) {
        return Z.valueOf(k);
      }
    }
  }
}

