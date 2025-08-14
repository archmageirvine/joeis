package irvine.oeis.a079;

import irvine.math.z.Z;

/**
 * A079417 Numbers n such that round(prime(n)/n) &lt; round(prime(n-1)/(n-1)).
 * @author Sean A. Irvine
 */
public class A079417 extends A079416 {

  private long mN = 1;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (mA.compareTo(t) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

