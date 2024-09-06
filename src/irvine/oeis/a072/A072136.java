package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A072136 Position of the first zero in the fractional part of the base n expansion of Pi.
 * @author Sean A. Irvine
 */
public class A072136 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    CR t = CR.PI;
    while (true) {
      ++m;
      t = t.multiply(mN);
      if (t.floor().mod(mN) == 0) {
        return Z.valueOf(m);
      }
    }
  }
}
