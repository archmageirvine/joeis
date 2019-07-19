package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a003.A003325;

/**
 * A024669 Position of <code>n^3 + (n+1)^3</code> in <code>A003325</code>.
 * @author Sean A. Irvine
 */
public class A024669 extends A003325 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mM).pow(3).add(Z.valueOf(mM + 1).pow(3));
    while (true) {
      ++mN;
      if (t.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
