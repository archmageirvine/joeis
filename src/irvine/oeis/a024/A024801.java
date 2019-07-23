package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000408;

/**
 * A024801.
 * @author Sean A. Irvine
 */
public class A024801 extends A000408 {

  private long mN = 0;
  private long mM;

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
