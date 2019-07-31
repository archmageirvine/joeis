package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a003.A003072;

/**
 * A024970 <code>a(n) =</code> position of <code>3*n^3</code> in <code>A003072</code>.
 * @author Sean A. Irvine
 */
public class A024970 extends A003072 {

  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mM).pow(3).multiply(3);
    while (true) {
      ++mN;
      if (super.next().equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
