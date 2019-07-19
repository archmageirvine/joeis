package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a003.A003325;

/**
 * A024667 <code>a(n) =</code> position of <code>2*n^3</code> in <code>A003325</code>.
 * @author Sean A. Irvine
 */
public class A024667 extends A003325 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mM).pow(3).multiply2();
    while (true) {
      ++mN;
      if (t.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
