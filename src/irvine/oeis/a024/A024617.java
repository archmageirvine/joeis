package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024617 Position of n^2 + n + 1 in A024614.
 * @author Sean A. Irvine
 */
public class A024617 extends A024614 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final Z m2 = Z.valueOf(++mM).square().add(mM + 1);
    while (true) {
      ++mN;
      if (super.next().equals(m2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
