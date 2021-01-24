package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038638 Numbers k such that k-th and (k+1)-st term of A038593 differ by 7.
 * @author Sean A. Irvine
 */
public class A038638 extends A038593 {

  private long mN = 0;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (t.add(7).equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}
