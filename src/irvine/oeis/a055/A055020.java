package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A055020 Number of iterations of sigma() required until 2n (or greater) is reached.
 * @author Sean A. Irvine
 */
public class A055020 extends Sequence2 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z lim = mN.multiply2();
    long c = 0;
    Z m = mN;
    while (m.compareTo(lim) < 0) {
      m = Functions.SIGMA1.z(m);
      ++c;
    }
    return Z.valueOf(c);
  }
}
