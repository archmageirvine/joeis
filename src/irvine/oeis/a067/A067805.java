package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067805 Numbers n such that the area of the parallelogram formed by the vectors (n, prime(n)) and (n+1, prime(n+1)) is an integer square, i.e., Det[{{n, prime(n)},{n+1, prime(n+1)}}] is an integer square.
 * @author Sean A. Irvine
 */
public class A067805 extends A000040 {

  private long mN = 0;
  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = mP;
      mP = super.next();
      if (mP.multiply(mN).subtract(p.multiply(mN + 1)).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
