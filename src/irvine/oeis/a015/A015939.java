package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015939.
 * @author Sean A. Irvine
 */
public class A015939 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z k = Z.ONE.shiftLeft(++mN);
    long j = 0;
    final Z n = Z.valueOf(mN);
    while (true) {
      k = k.add(1);
      ++j;
      if (Z.TWO.modPow(k, k).equals(Z.TWO.modPow(n, k))) {
        return Z.valueOf(j);
      }
    }
  }
}
