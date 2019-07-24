package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000408;

/**
 * A024800 <code>a(n) =</code> position of <code>3*(n^2)</code> in <code>A000408</code>.
 * @author Sean A. Irvine
 */
public class A024800 extends A000408 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mM).square().multiply(3);
    while (true) {
      ++mN;
      if (t.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
