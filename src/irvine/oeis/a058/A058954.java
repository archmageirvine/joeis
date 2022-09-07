package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058954 Numbers n such that A058933(n)=A058933(n+1).
 * @author Sean A. Irvine
 */
public class A058954 extends A058933 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.equals(t)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
