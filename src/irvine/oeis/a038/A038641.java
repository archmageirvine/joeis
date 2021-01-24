package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038641 Numbers k such that k-th and (k+1)-st term of A038593 differ by 10.
 * @author Sean A. Irvine
 */
public class A038641 extends A038593 {

  private long mN = 0;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (t.add(10).equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}
