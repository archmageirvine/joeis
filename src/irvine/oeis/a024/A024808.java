package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a004.A004432;

/**
 * A024808 <code>a(n) =</code> position of <code>5 + n^2</code> in <code>A004432</code>.
 * @author Sean A. Irvine
 */
public class A024808 extends A004432 {

  private long mN = 0;
  private long mM = 2;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mM).square().add(5);
    while (true) {
      ++mN;
      if (t.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
